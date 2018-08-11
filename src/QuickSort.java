
public class QuickSort {
	public void qsort(int[] arr, int low, int high){
	    if (low < high){
	        int pivot=partition(arr, low, high);        //将数组分为两部分
	        qsort(arr, low, pivot-1);                   //递归排序左子数组
	        qsort(arr, pivot+1, high);                  //递归排序右子数组
	    }
	}	
	private int partition(int[] arr, int low, int high){
		//封装的找到数组一个中间值的方法
		 
	    int pivot = arr[low];     //枢轴记录
	    while(low<high) {
	        while (low<high && arr[high]>=pivot) 
	        	high--;	 
	        arr[low]=arr[high];             //交换比枢轴小的记录到左端

	        while (low<high && arr[low]<=pivot) 
	        	low++;
	        arr[high] = arr[low];           //交换比枢轴小的记录到右端  
			  }			  
        arr[low] = pivot;
	    return low;//
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
int[]a= {6,1,2,7,9,3,4,5,10,8};
QuickSort x=new QuickSort();
//x.quicksort(a, 0, 9);
	x.qsort(a, 0, a.length-1);

for(int i=0;i<a.length;i++) {
	System.out.println(a[i]);
}
	}
}