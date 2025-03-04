int a[10] = {1,4,7,2,3,0,8,5,9,6};	// BitMINICC灏氭湭瀹炵幇鎸囬拡锛岄噰鐢ㄥ叏灞�鏁扮粍
void quick(int x_start,int x_end);
int partion(int x_low,int x_high);
void quickSort(int len){
	quick(0,len-1);
	return;
}
void quick(int x_start,int x_end){
	int par = partion(x_start, x_end);
	if(par > x_start + 1){
		quick(x_start, par-1);
	}
	if(par < x_end - 1){
		quick(par+1, x_end);
	}
	return;
}
int partion(int x_low, int x_high){
	int tmp = a[x_low];
	for(; x_low < x_high; ){
		for(; x_low < x_high && a[x_high] > tmp;){
			x_high --;
		}
		if(x_low >= x_high){
			break;
		}else{
			a[x_low] = a[x_high];
		}
		for(; x_low < x_high && a[x_low] < tmp;){
			x_low ++;
		}
		if(x_low >= x_high){
			break;
		}else{
			a[x_high] = a[x_low];
		}
	}
	a[x_low] = tmp;

	return x_low;
}
int main(){
	printf("Before quicksort:\n");
	for(int i = 0; i<10; i++){
		printf("%d,", a[i]);
	}
	quickSort(10);
	printf("\nAfter quicksort:\n");
	for(int i = 0; i<10; i++){
		printf("%d,", a[i]);
	}
	printf("\n");
    return 0;
}