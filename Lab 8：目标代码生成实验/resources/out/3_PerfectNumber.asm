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
perfectNumberStrConst0 db '%d ', 0
perfectNumberStrConst1 db 0ah, 'The sum is :', 0ah, 0
perfectNumberStrConst2 db '%d', 0ah, 0
mainStrConst3 db 'All perfect numbers within 100:', 0ah, 0
szPause db 'pause', 0

.data

.code

perfectNumber proc uses ebx esi edi n:dword
	local p[80]:dword
	local i:dword
	local num:dword
	local count:dword
	local s:dword
	local sum:dword
	mov sum, 0
	mov num, 2
L0:
	mov eax, num
	cmp eax, n
	setl al
	movzx eax, al
	test eax, eax
	jz N1
	mov count, 0
	mov ebx, num
	mov s, ebx
	mov i, 1
L2:
	mov ecx, ebx
	mov esi, 2
	push eax
	push edx
	mov eax, ecx
	cdq
	idiv esi
	mov ecx, eax
	pop edx
	pop eax
	add ecx, 1
	mov eax, i
	cmp eax, ecx
	setl al
	movzx eax, al
	test eax, eax
	jz N3
	mov edx, ebx
	push eax
	mov eax, edx
	cdq
	idiv i
	pop eax
	cmp edx, 0
	sete dl
	movzx edx, dl
	.if edx
	mov eax, count
	inc count
	lea esi, p
	lea esi, [esi+eax*4]
	mov ecx, i
	mov [esi], ecx
	mov eax, i
	sub s, eax
	.endif
	inc i
	jmp L2
N3:
	mov eax, 0
	cmp eax, s
	sete al
	movzx eax, al
	.if eax
	invoke printf ,addr perfectNumberStrConst0 ,ebx
	inc sum
	.endif
	inc num
	jmp L0
N1:
	invoke printf ,addr perfectNumberStrConst1
	invoke printf ,addr perfectNumberStrConst2 ,sum
	ret
perfectNumber endp

main proc uses ebx esi edi 
	invoke printf ,addr mainStrConst3
	invoke perfectNumber ,100
	mov eax, 0
	ret
main endp
start:
	call main
	invoke crt_system, addr szPause
	invoke ExitProcess, 0
end start
