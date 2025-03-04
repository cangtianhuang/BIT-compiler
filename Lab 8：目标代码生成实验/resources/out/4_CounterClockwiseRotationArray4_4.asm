.386
.model flat, stdcall
option casemap:none

include msvcrt.inc
include kernel32.inc
includelib msvcrt.lib
includelib kernel32.lib
scanf PROTO C:DWORD, :vararg
printf PROTO C:DWORD, :vararg

.const
array4_4StrConst0 db 'Please Input 16 numbers:', 0ah, 0
array4_4StrConst1 db '%d', 0
array4_4StrConst2 db 'Array A:', 0ah, 0
array4_4StrConst3 db '%d ', 0
array4_4StrConst4 db 0ah, 0
array4_4StrConst5 db 'Array B:', 0ah, 0
array4_4StrConst6 db '%d ', 0
array4_4StrConst7 db 0ah, 0
szPause db 'pause', 0

.data

.code

array4_4 proc uses ebx esi edi 
	local A[16]:dword
	local B[16]:dword
	local i:dword
	local j:dword
	invoke printf ,addr array4_4StrConst0
	mov i, 0
L0:
	mov ebx, i
	cmp ebx, 4
	setl bl
	movzx ebx, bl
	test ebx, ebx
	jz N1
	mov j, 0
L2:
	mov eax, j
	cmp eax, 4
	setl al
	movzx eax, al
	test eax, eax
	jz N3
	lea esi, A
	mov ebx, i
	imul ebx, 4
	lea esi, [esi+ebx*4]
	mov ebx, j
	lea esi, [esi+ebx*4]
	invoke scanf ,addr array4_4StrConst1 ,esi
	lea esi, A
	mov ebx, i
	imul ebx, 4
	lea esi, [esi+ebx*4]
	mov ebx, j
	lea esi, [esi+ebx*4]
	mov esi, [esi]
	mov ebx, 3
	sub ebx, j
	lea eax, B
	imul ebx, 4
	lea eax, [eax+ebx*4]
	mov ecx, i
	lea eax, [eax+ecx*4]
	mov [eax], esi
	inc j
	jmp L2
N3:
	inc i
	jmp L0
N1:
	invoke printf ,addr array4_4StrConst2
	mov i, 0
L4:
	mov ebx, i
	cmp ebx, 4
	setl bl
	movzx ebx, bl
	test ebx, ebx
	jz N5
	mov j, 0
L6:
	mov eax, j
	cmp eax, 4
	setl al
	movzx eax, al
	test eax, eax
	jz N7
	lea esi, A
	mov ebx, i
	imul ebx, 4
	lea esi, [esi+ebx*4]
	mov ebx, j
	lea esi, [esi+ebx*4]
	mov esi, [esi]
	invoke printf ,addr array4_4StrConst3 ,esi
	inc j
	jmp L6
N7:
	invoke printf ,addr array4_4StrConst4
	inc i
	jmp L4
N5:
	invoke printf ,addr array4_4StrConst5
	mov i, 0
L8:
	mov ebx, i
	cmp ebx, 4
	setl bl
	movzx ebx, bl
	test ebx, ebx
	jz N9
	mov j, 0
L10:
	mov eax, j
	cmp eax, 4
	setl al
	movzx eax, al
	test eax, eax
	jz N11
	lea esi, B
	mov ebx, i
	imul ebx, 4
	lea esi, [esi+ebx*4]
	mov ebx, j
	lea esi, [esi+ebx*4]
	mov esi, [esi]
	invoke printf ,addr array4_4StrConst6 ,esi
	inc j
	jmp L10
N11:
	invoke printf ,addr array4_4StrConst7
	inc i
	jmp L8
N9:
	ret
array4_4 endp

main proc uses ebx esi edi 
	invoke array4_4
	mov eax, 0
	ret
main endp
start:
	call main
	invoke crt_system, addr szPause
	invoke ExitProcess, 0
end start
