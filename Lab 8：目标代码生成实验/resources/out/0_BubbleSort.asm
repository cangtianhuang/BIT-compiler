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
mainStrConst0 db 'please input ten int number for bubble sort:', 0ah, 0
mainStrConst1 db '%d', 0
mainStrConst2 db 'before bubble sort:', 0ah, 0
mainStrConst3 db '%d ', 0
mainStrConst4 db 0ah, 0
mainStrConst5 db 'after bubble sort:', 0ah, 0
mainStrConst6 db '%d ', 0
mainStrConst7 db 0ah, 0
szPause db 'pause', 0

.data

.code

main proc uses ebx esi edi 
	local a[10]:dword
	invoke printf ,addr mainStrConst0
	mov ecx, 0
L0:
	mov eax, ecx
	cmp eax, 10
	setl al
	movzx eax, al
	test eax, eax
	jz N1
	lea esi, a
	lea esi, [esi+ecx*4]
	push ecx
	invoke scanf ,addr mainStrConst1 ,esi
	pop ecx
	inc ecx
	jmp L0
N1:
	push ecx
	invoke printf ,addr mainStrConst2
	pop ecx
	mov ecx, 0
L2:
	mov ebx, ecx
	cmp ebx, 10
	setl bl
	movzx ebx, bl
	test ebx, ebx
	jz N3
	lea esi, a
	lea esi, [esi+ecx*4]
	mov esi, [esi]
	push ecx
	invoke printf ,addr mainStrConst3 ,esi
	pop ecx
	inc ecx
	jmp L2
N3:
	push ecx
	invoke printf ,addr mainStrConst4
	pop ecx
	mov ecx, 0
L4:
	mov ebx, ecx
	cmp ebx, 10
	setl bl
	movzx ebx, bl
	test ebx, ebx
	jz N5
	mov eax, 0
L6:
	mov ebx, 10
	sub ebx, ecx
	sub ebx, 1
	mov edx, eax
	cmp edx, ebx
	setl dl
	movzx edx, dl
	test edx, edx
	jz N7
	lea esi, a
	lea esi, [esi+eax*4]
	mov esi, [esi]
	mov edi, eax
	add edi, 1
	lea ebx, a
	lea ebx, [ebx+edi*4]
	mov ebx, [ebx]
	cmp esi, ebx
	push eax
	setg al
	movzx eax, al
	mov esi, eax
	pop eax
	.if esi
	lea esi, a
	lea esi, [esi+eax*4]
	mov esi, [esi]
	mov edx, eax
	add edx, 1
	lea edi, a
	lea edi, [edi+edx*4]
	mov edi, [edi]
	lea edx, a
	lea edx, [edx+eax*4]
	mov [edx], edi
	mov edx, eax
	add edx, 1
	lea edi, a
	lea edi, [edi+edx*4]
	mov [edi], esi
	.endif
	inc eax
	jmp L6
N7:
	inc ecx
	jmp L4
N5:
	push ecx
	invoke printf ,addr mainStrConst5
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
	invoke printf ,addr mainStrConst6 ,esi
	pop ecx
	inc ecx
	jmp L8
N9:
	invoke printf ,addr mainStrConst7
	mov eax, 0
	ret
main endp
start:
	call main
	invoke crt_system, addr szPause
	invoke ExitProcess, 0
end start
