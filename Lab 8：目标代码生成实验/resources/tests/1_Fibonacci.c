int fibonacci(int num){
	int res;
	if(num < 1){
		res = 0;
	}else if(num <= 2){
		res = 1;
	}else{
		res = fibonacci(num-1)+fibonacci(num-2);
	}
	return res;
}
int main(){
	printf("Please input a number:\n");
	int n;
	scanf("%d", &n);
	int res = fibonacci(n);
	printf("This number''s fibonacci value is:\n");
	printf("%d\n", res);
    return 0;
}