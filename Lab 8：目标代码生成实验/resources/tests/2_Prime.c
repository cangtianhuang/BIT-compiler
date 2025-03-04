int prime(int n){
	int sum = 0;
	int i,j,flag = 1;
	for(i = 2; i<=n; i++){
		flag = 1;
		for(j = 2; j*j <= i; j++){
			if(i%j == 0){
				flag = 0;
				break;
			}
		}
		if(flag == 1){
			sum ++;
			printf("%d ", i);
		}
	}
	return sum;
}
int main(){
	printf("Please input a number:\n");
	int n;
	scanf("%d", &n);
	int res = prime(n);
	printf("\nThe number of prime numbers within n is:\n");
	printf("%d\n", res);
    return 0;
}