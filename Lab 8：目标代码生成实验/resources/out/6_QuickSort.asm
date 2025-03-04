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
mainStrConst0 db 'Before quicksort:', 0ah, 0
mainStrConst1 db '%d,', 0
mainStrConst2 db 0ah, 'After quicksort:', 0ah, 0
mainStrConst3 db '%d,', 0
mainStrConst4 db 0ah, 0
szPause db 'pause', 0

.data
a dword 1,4,7,2,3,0,8,5,9,6

.code
quick proto x_start:dword, x_end:dword
partion proto x_low:dword, x_high:dword

quickSort proc uses ebx esi edi len:dword
	mov eax, len
	sub eax, 1
	invoke quick ,0 ,eax
	ret
quickSort endp

quick proc uses ebx esi edi x_start:dword, x_end:dword
	local par:dword
	invoke partion ,x_start ,x_end
	mov ebx, x_start
	add ebx, 1
	mov ecx, eax
	cmp ecx, ebx
	setg cl
	movzx ecx, cl
	.if ecx
	mov edx, eax
	sub edx, 1
	mov ebx, eax
	invoke quick ,x_start ,edx
	.endif
	mov ecx, x_end
	sub ecx, 1
	mov eax, ebx
	cmp eax, ecx
	setl al
	movzx eax, al
	.if eax
	add ebx, 1
	invoke quick ,ebx ,x_end
	.endif
	ret
quick endp

partion proc uses ebx esi edi x_low:dword, x_high:dword
	local tmp:dword
	lea esi, a
	mov eax, x_low
	lea esi, [esi+eax*4]
	mov esi, [esi]
L0:
	mov eax, x_low
	cmp eax, x_high
	setl al
	movzx eax, al
	test eax, eax
	jz N1
L2:
	mov ebx, x_low
	cmp ebx, x_high
	setl bl
	movzx ebx, bl
	lea eax, a
	mov ecx, x_high
	lea eax, [eax+ecx*4]
	mov eax, [eax]
	cmp eax, esi
	setg al
	movzx eax, al
	and ebx, eax
	test ebx, ebx
	jz N3
	dec x_high
	jmp L2
N3:
	mov ecx, x_low
	cmp ecx, x_high
	setge cl
	movzx ecx, cl
	.if ecx
	jmp N1
	.else
	lea eax, a
	mov ebx, x_high
	lea eax, [eax+ebx*4]
	mov eax, [eax]
	lea ebx, a
	mov edx, x_low
	lea ebx, [ebx+edx*4]
	mov [ebx], eax
	.endif
L4:
	mov ebx, x_low
	cmp ebx, x_high
	setl bl
	movzx ebx, bl
	lea eax, a
	mov ecx, x_low
	lea eax, [eax+ecx*4]
	mov eax, [eax]
	cmp eax, esi
	setl al
	movzx eax, al
	and ebx, eax
	test ebx, ebx
	jz N5
	inc x_low
	jmp L4
N5:
	mov ecx, x_low
	cmp ecx, x_high
	setge cl
	movzx ecx, cl
	.if ecx
	jmp N1
	.else
	lea eax, a
	mov ebx, x_low
	lea eax, [eax+ebx*4]
	mov eax, [eax]
	lea ebx, a
	mov edx, x_high
	lea ebx, [ebx+edx*4]
	mov [ebx], eax
	.endif
	jmp L0
N1:
	lea ebx, a
	mov edx, x_low
	lea ebx, [ebx+edx*4]
	mov [ebx], esi
	mov eax, x_low
	ret
partion endp

main proc uses ebx esi edi 
	invoke printf ,addr mainStrConst0
	mov ecx, 0
L6:
	mov eax, ecx
	cmp eax, 10
	setl al
	movzx eax, al
	test eax, eax
	jz N7
	lea esi, a
	lea esi, [esi+ecx*4]
	mov esi, [esi]
	push ecx
	invoke printf ,addr mainStrConst1 ,esi
	pop ecx
	inc ecx
	jmp L6
N7:
	push ecx
	invoke quickSort ,10
	pop ecx
	push ecx
	invoke printf ,addr mainStrConst2
	pop ecx
	mov ecx, 0
L8:
	mov ebx, ecx
	cmp ebx, 10
	setl bl
	movzx ebx, bl
	test ebx, ebx
	jz N9
	lea esi, a
	lea esi, [esi+ecx*4]
	mov esi, [esi]
	push ecx
	invoke printf ,addr mainStrConst3 ,esi
	pop ecx
	inc ecx
	jmp L8
N9:
	invoke printf ,addr mainStrConst4
	mov eax, 0
	ret
main endp
start:
	call main
	invoke crt_system, addr szPause
	invoke ExitProcess, 0
end start
