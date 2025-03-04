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
YangHuiTriangleStrConst0 db '%d ', 0
YangHuiTriangleStrConst1 db 0ah, 0
szPause db 'pause', 0

.data

.code

YangHuiTriangle proc uses ebx esi edi 
	local i:dword
	local j:dword
	local triangle[64]:dword
	mov i, 0
L0:
	mov eax, i
	cmp eax, 8
	setl al
	movzx eax, al
	test eax, eax
	jz N1
	mov j, 0
L2:
	mov ebx, j
	cmp ebx, 8
	setl bl
	movzx ebx, bl
	test ebx, ebx
	jz N3
	lea esi, triangle
	mov eax, i
	imul eax, 8
	lea esi, [esi+eax*4]
	mov eax, j
	lea esi, [esi+eax*4]
	mov eax, 1
	mov [esi], eax
	inc j
	jmp L2
N3:
	inc i
	jmp L0
N1:
	mov i, 2
L4:
	mov eax, i
	cmp eax, 8
	setl al
	movzx eax, al
	test eax, eax
	jz N5
	mov j, 1
L6:
	mov ebx, j
	cmp ebx, i
	setl bl
	movzx ebx, bl
	test ebx, ebx
	jz N7
	mov eax, i
	sub eax, 1
	lea esi, triangle
	imul eax, 8
	lea esi, [esi+eax*4]
	mov ebx, j
	lea esi, [esi+ebx*4]
	mov esi, [esi]
	mov ebx, i
	sub ebx, 1
	lea eax, triangle
	imul ebx, 8
	lea eax, [eax+ebx*4]
	mov ecx, j
	sub ecx, 1
	lea eax, [eax+ecx*4]
	mov eax, [eax]
	add esi, eax
	lea ebx, triangle
	mov ecx, i
	imul ecx, 8
	lea ebx, [ebx+ecx*4]
	mov ecx, j
	lea ebx, [ebx+ecx*4]
	mov [ebx], esi
	inc j
	jmp L6
N7:
	inc i
	jmp L4
N5:
	mov i, 0
L8:
	mov ebx, i
	cmp ebx, 8
	setl bl
	movzx ebx, bl
	test ebx, ebx
	jz N9
	mov j, 0
L10:
	mov eax, j
	cmp eax, i
	setle al
	movzx eax, al
	test eax, eax
	jz N11
	lea esi, triangle
	mov ebx, i
	imul ebx, 8
	lea esi, [esi+ebx*4]
	mov ebx, j
	lea esi, [esi+ebx*4]
	mov esi, [esi]
	invoke printf ,addr YangHuiTriangleStrConst0 ,esi
	inc j
	jmp L10
N11:
	invoke printf ,addr YangHuiTriangleStrConst1
	inc i
	jmp L8
N9:
	ret
YangHuiTriangle endp

main proc uses ebx esi edi 
	invoke YangHuiTriangle
	mov eax, 0
	ret
main endp
start:
	call main
	invoke crt_system, addr szPause
	invoke ExitProcess, 0
end start
