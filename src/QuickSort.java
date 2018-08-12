public class QuickSort {
	public void quickSort(int arr[],int left,int right) {
		if(left<right) {
			int pivot=partition(arr,left,right);//找到中间位置归位,先分开才能实现分治法
			quickSort(arr,left,pivot-1);//递归左边的部分
			quickSort(arr,pivot+1,right);//递归右边的部分		
	}
		}
		public int partition(int[] arr, int left, int right){
	    int pivot = arr[left];    
	    while(left<right) {//3ppyouyou左，左左右
	        while (left<right && arr[right]>=pivot) {
	        	right--;	
	        	}
	        arr[left]=arr[right]; 
	        while (left<right && arr[left]<=pivot) { 
	        	left++;
	        	}
	        arr[right]=arr[left]; 	        
	    }
        arr[left] = pivot;
	    return left;
}
	public static void main(String[] args) {		
int[]a= {3,1,2,6,9,10,4,5,7,8};
QuickSort x=new QuickSort();
x.quickSort(a, 0, 9);
for(int i=0;i<a.length;i++) {
	System.out.println(a[i]);
}
	}
}