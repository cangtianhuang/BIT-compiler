// You shoud input 16 numbers.
void array4_4(){
	int A[4][4],B[4][4],i,j;
	printf("Please Input 16 numbers:\n");
	for(i = 0; i < 4; i++)
		for(j = 0; j < 4; j++)
		{
			scanf("%d", &A[i][j]);
			B[3-j][i] = A[i][j];   		  //鏃嬭浆90搴﹁祴鍊�
		}
	printf("Array A:\n");          //杈撳嚭鐭╅樀A
	for( i = 0; i < 4; i++)
	{
		for(j = 0 ; j < 4; j++)
		{
			printf("%d ", A[i][j]);	
		}
		printf("\n");
	}
	printf("Array B:\n");          //杈撳嚭鐭╅樀B
	for( i = 0; i < 4; i++)
	{
		for(j = 0 ; j < 4; j++)
		{
			printf("%d ", B[i][j]);		
		}
		printf("\n");
	}

	return ;
}
int main(){
	array4_4();
    return 0;
}