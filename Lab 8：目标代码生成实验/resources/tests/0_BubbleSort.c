int main(){
	int a[10];
	printf("please input ten int number for bubble sort:\n");
	for (int i = 0; i < 10; i++) {
		scanf("%d", &a[i]);
	}
	printf("before bubble sort:\n");
	for (int i = 0; i < 10; i++) {
		printf("%d ", a[i]);
	}
	printf("\n");
	// bubble sort
	for (int i = 0; i < 10; i++) {
		for (int j = 0; j < 10-i-1; j++) {
			if (a[j] > a[j + 1]) {
				int tmp = a[j];
				a[j] = a[j + 1];
				a[j + 1] = tmp;
			}
		}
	}
	printf("after bubble sort:\n");
	for (int i = 0; i < 10; i++) {
		printf("%d ", a[i]);
	}
	printf("\n");
    return 0;
}