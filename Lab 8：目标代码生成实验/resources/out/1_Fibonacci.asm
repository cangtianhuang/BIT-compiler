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
mainStrConst0 db 'Please input a number:', 0ah, 0
mainStrConst1 db '%d', 0
mainStrConst2 db 'This number''s fibonacci value is:', 0ah, 0
mainStrConst3 db '%d', 0ah, 0
szPause db 'pause', 0

.data

.code

fibonacci proc uses ebx esi edi num:dword
	local res:dword
	mov eax, num
	cmp eax, 1
	setl al
	movzx eax, al
	.if eax
	mov res, 0
	.else
	mov ebx, num
	cmp ebx, 2
	setle bl
	movzx ebx, bl
	.if ebx
	mov res, 1
	.else
	mov eax, num
	sub eax, 1
	invoke fibonacci ,eax
	mov ebx, num
	sub ebx, 2
	mov ecx, eax
	push ecx
	invoke fibonacci ,ebx
	pop ecx
	mov res, ecx
	add res, eax
	.endif
	.endif
	mov eax, res
	ret
fibonacci endp

main proc uses ebx esi edi 
	local n:dword
	local res:dword
	invoke printf ,addr mainStrConst0
	lea ebx, n
	invoke scanf ,addr mainStrConst1 ,ebx
	invoke fibonacci ,n
	mov ebx, eax
	invoke printf ,addr mainStrConst2
	invoke printf ,addr mainStrConst3 ,ebx
	mov eax, 0
	ret
main endp
start:
	call main
	invoke crt_system, addr szPause
	invoke ExitProcess, 0
end start
