/*
Input
5
233 31 23 1 2
Output
1 2 23 31 233

*/
//complexity n*n
import java.util.Scanner;
class QuickSort{
	private static Scanner scan = new Scanner(System.in);
	static void swap(int[] arr,int a,int b){			//swapping two elements in an array
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b]=temp; 
	}
	static void quicksort(int[] arr,int low, int high){			//sorting the array
		if(low>=high)
			return;
		int mid = partition(arr,low,high);
		quicksort(arr,low,mid-1);
		quicksort(arr,mid+1,high);

	}
	static int partition(int[] arr,int low,int high){			//partitions the array into two and +returns new pivot element
			int mid = low + (high-low)/2;
			int pivot = arr[mid];						//middle element is pivot
		while(low<high){
			while(arr[low]<pivot)low++;					
			while(arr[high]>pivot)high--;
			if(low<high)
				swap(arr,low,high);
		}
		return high;
	}
	public static void main(String[] args) {
		int len = scan.nextInt();
		int[] arr = new int[len];
		//int[] arr = {4,5,1,3,7};
		for(int i=0;i<len;i++)  
			arr[i]=scan.nextInt();
		int low=0,high=len-1;
		quicksort(arr,low,high);
		for(int i=0;i<len;i++)
			System.out.print(arr[i]+" ");
 	}
}