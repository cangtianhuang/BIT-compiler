include Irvine32.inc 

Read_Text PROTO
Change_to_M PROTO
Cal_M PROTO
Output_File PROTO
GetCommandtail PROTO 

PDWORD TYPEDEF PTR DWORD			
PB TYPEDEF PTR BYTE	
.data
M1 DWORD 10000 DUP (0);三个矩阵
M2 DWORD 10000 DUP (0)
M3 DWORD 10000 DUP (0)
row1 DWORD ?;矩阵行列信息
row2 DWORD ?
col1 DWORD ?
col2 DWORD ?
i1 DWORD ?
i2 DWORD ?
filehandle DWORD ?

now1 PDWORD ?;指针
now11 PDWORD ? 
now2 PDWORD ?
now22 PDWORD ?
now3 PDWORD ?
jump1 DWORD ?
jump2 DWORD ?
start PDWORD ?
row PDWORD ?
col PDWORD ?
buff_tmp PB ?

num DWORD ?
text BYTE 600 DUP(0);输入命令行
input1 BYTE 200 DUP(0)
input2 BYTE 200 DUP(0)
input PB ?
output BYTE 200 DUP(0)
input1_size DWORD 0
input2_size DWORD 0
output_size DWORD 0
eccx DWORD 0

cnt DWORD 1

wa1 BYTE "Wrong Input!",0
wa2 BYTE "Open File Failed!",0
wa3 BYTE "Can't Calculate!",0
accept BYTE 'The answer matrix is',10,0
buff BYTE 10000 dup(?)
buff_size DWORD 0
.code
main PROC
    mov edx,offset text                                ;读入命令行
    call GetCommandtail                            
    call Read_Text

    mov al,input1[0]                                   ;文件名是否正常识别
    cmp al,00h
    je err1
    mov al,input2[0]
    cmp al,00h
    je err1
    mov al,output[0]
    cmp al,00h
    je err1

    mov start,offset M1
    mov edx,offset input1
    mov row,offset row1
    mov col,offset col1
    call Change_to_M

    mov start,offset M2
    mov edx,offset input2
    mov row,offset row2
    mov col,offset col2
    call Change_to_M

    mov eax,col1
    cmp eax,row2
    jne err3

    mov edx,offset accept
    call writestring

    call Cal_M

    call Output_File

    exit

    err1:
        mov edx,offset wa1
        call writestring
        exit

    err3:
        mov edx,offset wa3
        call writestring
        exit

main ENDP

;-----------------------------------------------------------------------------------------
;读取命令行，然后分解
Read_Text PROC
    mov ecx,1
    for1:
        cmp text[ecx],00h                         ;字符串结束
        je break
        cmp text[ecx]," "                         ;出现空格，代表下一个
        je next
        mov al,text[ecx]                          ;EAX低16位为AX，AX低8位为AL
        cmp cnt,1
        je input1_in
        cmp cnt,2
        je input2_in
        cmp cnt,3
        je output_in

        next:                                      ;一个文件名完毕，下一个
            inc cnt
            jmp continue

        input1_in:                                ;input1的文件名
            mov esi,input1_size
            mov input1[esi],al
            inc input1_size
            jmp continue

        input2_in:                                ;input2的文件名
            mov esi,input2_size
            mov input2[esi],al
            inc input2_size
            jmp continue

        output_in:                                ;output的文件名
            mov esi,output_size
            mov output[esi],al
            inc output_size
            jmp continue 

        continue:
        inc ecx
    jmp for1
    break:
    ret
Read_Text ENDP
;-----------------------------------------------------------------------------------------
;转化出矩阵
Change_to_M PROC
    mov input,edx 
    mov eccx,ecx
    mov eax,0                           ;先把eax=0，防止对invailed判断造成影响
    call openinputfile                  ;打开文件名存在edx中
    cmp eax,invalid_handle_value
    je err2
    mov filehandle,eax
    mov esi,offset buff
    mov ecx,lengthof buff
    clear:                              ;清空缓冲区
        mov ebx,0
        mov [esi],ebx
        add esi,type BYTE
    loop clear    
    mov edx,offset buff
    mov ecx,lengthof buff
    call readfromfile                   ;磁盘文件加载到缓冲区
    mov eax,filehandle
    call closefile

    mov esi,row                         ;从1行1列开始
    mov ebx,[esi]
    inc ebx
    mov [esi],ebx
    mov esi,col
    mov ebx,[esi]
    inc ebx
    mov [esi],ebx                  
    
    mov ecx,0
    Getchar:
        mov esi,start
        cmp buff[ecx],' '               ;空格
        je space
        cmp buff[ecx],0dh               ;回车
        je next
        cmp buff[ecx],10                ;换行
        je enter_
        cmp buff[ecx],00h               ;结束
        je _end

        mov eax,[esi]
        mov edx,10
        mul edx
        mov [esi],eax
        mov eax,0                       ;这里不赋0的话，后面只是对eax的低位操作，高位不改变，会产生影响
        mov al,buff[ecx]
        sub al,'0'                      ;字符是8位
        add [esi],eax                   ;数组是32位的
        jmp next

        space:
            mov esi,start                ;调试语句
            mov eax,[esi]                ;调试语句

            add start,type DWORD
            mov esi,row
            mov ebx,[esi]
            cmp ebx,1                 ;不是第一行，说明列数已经统计完毕
            jne next
            mov esi,col
            mov ebx,[esi]
            inc ebx
            mov [esi],ebx
            jmp next

        enter_:
            mov esi,start                ;调试语句
            mov eax,[esi]                ;调试语句


            add start,type DWORD
            mov esi,row
            mov ebx,[esi]
            inc ebx
            mov [esi],ebx
            jmp next
        
        _end:
            mov esi,start                ;调试语句
            mov eax,[esi]                ;调试语句
            jmp realend
        
        next:
            inc ecx
            jmp Getchar

        realend:
    ret

    err2:
        mov edx,offset wa2
        call writestring
        exit
Change_to_M ENDP
;-----------------------------------------------------------------------------------------
;矩阵计算
Cal_M PROC
    mov eax,type M1;jump1=DW*col1-
    mov ebx,col1
    mul ebx
    mov jump1,eax

    mov eax,type M1;jump2=DW*col2
    mov ebx,col2
    mul ebx
    mov jump2,eax


    mov edx,offset M1;now1
    mov now1,edx
    mov edx,offset M3;now3
    mov now3,edx

    mov i1,0
    for1:
        mov eax,i1
        cmp eax,row1
        je break1
        mov edx,offset M2;now2
        mov now2,edx
        mov i2,0
        for2:
            mov eax,i2
            cmp eax,col2
            je break2
            mov eax,now1;now11=now1
            mov now11,eax
            mov eax,now2;now22=now2
            mov now22,eax
            mov ecx,col1
            L9:
                mov esi,now11
                mov eax, [esi];[now11]*[now22]
                mov esi,now22
                mov ebx,[esi]
                mul ebx

                mov esi,now3
                add eax,[esi];[now3]+=[now11]*[now22]
                mov [esi],eax
                
                mov eax,now11;now11++
                add eax,type DWORD
                mov now11,eax
                mov eax,now22;now22+=jump2
                add eax,jump2
                mov now22,eax
            loop L9
            mov eax,now3;now3++
            add eax,type DWORD
            mov now3,eax
            mov eax,now2;now2++
            add eax,type DWORD
            mov now2,eax
            inc i2
            jmp for2
        break2:
        mov eax,now1;now1+=jump1
        add eax,jump1
        mov now1,eax
        inc i1
        jmp for1
    break1:

    mov eax,row1;eax=row1*col2
    mov ebx,col2
    mul ebx
    mov num,eax
    ret
Cal_M ENDP
;-----------------------------------------------------------------------------------------
;输出
Output_File PROC
    mov esi,offset buff
    mov buff_tmp,esi
    mov edx,offset M3
    mov now3,edx
    mov i1,0
    for1:
        mov eax,i1
        cmp eax,row1
        je break1

        mov i2,0
        for2:
            mov eax,i2
            cmp eax,col2
            je break2
            
            mov ecx,0
            mov esi,now3
            mov eax,[esi]
            for3:
                cmp eax,0
                je break3
                inc ecx
                mov edx,0                                ;余数清0
                mov ebx,10
                div ebx

                add edx,'0'
                push edx
                jmp for3
            break3:

            for4:
                pop eax
                mov esi,buff_tmp
                mov [esi],al
                inc buff_tmp
                inc buff_size
            loop for4

            mov al,' '
            mov esi,buff_tmp
            mov [esi],al
            inc buff_tmp
            inc buff_size

            mov esi,now3
            add esi,type DWORD
            mov now3,esi
            inc i2
            jmp for2
        break2:

        mov al,10
        mov esi,buff_tmp
        mov [esi],al
        inc buff_tmp
        inc buff_size

        inc i1
        jmp for1
    break1:

    mov al,00h
    mov esi,buff_tmp
    mov [esi],al
    inc buff_tmp
    inc buff_size

    mov edx,offset buff
    call writestring

    mov edx,offset output
    call createoutputfile
    cmp eax,invalid_handle_value
    je err2
    mov edx,offset buff
    mov ecx,buff_size
    call writetofile
    

    ret
    err2:
        call writestring
        mov edx,offset wa2
        call writestring
        exit

Output_File ENDP

END main
