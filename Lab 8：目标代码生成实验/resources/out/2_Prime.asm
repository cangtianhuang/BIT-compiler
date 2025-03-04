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
primeStrConst0 db '%d ', 0
mainStrConst1 db 'Please input a number:', 0ah, 0
mainStrConst2 db '%d', 0
mainStrConst3 db 0ah, 'The number of prime numbers within n is:', 0ah, 0
mainStrConst4 db '%d', 0ah, 0
szPause db 'pause', 0

.data

.code

prime proc uses ebx esi edi n:dword
	local sum:dword
	local i:dword
	local j:dword
	local flag:dword
	mov sum, 0
	mov flag, 1
	mov i, 2
L0:
	mov eax, i
	cmp eax, n
	setle al
	movzx eax, al
	test eax, eax
	jz N1
	mov flag, 1
	mov j, 2
L2:
	mov ebx, j
	imul ebx, j
	cmp ebx, i
	setle bl
	movzx ebx, bl
	test ebx, ebx
	jz N3
	mov eax, i
	push edx
	cdq
	idiv j
	mov eax, edx
	pop edx
	cmp eax, 0
	sete al
	movzx eax, al
	.if eax
	mov flag, 0
	jmp N3
	.endif
	inc j
	jmp L2
N3:
	mov ebx, flag
	cmp ebx, 1
	sete bl
	movzx ebx, bl
	.if ebx
	inc sum
	invoke printf ,addr primeStrConst0 ,i
	.endif
	inc i
	jmp L0
N1:
	mov eax, sum
	ret
prime endp

main proc uses ebx esi edi 
	local n:dword
	local res:dword
	invoke printf ,addr mainStrConst1
	lea ebx, n
	invoke scanf ,addr mainStrConst2 ,ebx
	invoke prime ,n
	mov ebx, eax
	invoke printf ,addr mainStrConst3
	invoke printf ,addr mainStrConst4 ,ebx
	mov eax, 0
	ret
main endp
start:
	call main
	invoke crt_system, addr szPause
	invoke ExitProcess, 0
end start
