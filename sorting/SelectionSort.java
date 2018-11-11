/*
5
20 234 -29 32 21
-29 20 21 32 234
*/
//complexity n * n
import java.util.Scanner;
class SelectionSort{
	private static Scanner scan = new Scanner(System.in);
	static void swap(int[] arr,int a,int b){
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	static void  selectionSort(int[] arr,int len){
		int min=0;
		for(int i=0;i<len-1;i++){
			min = i;
			for(int j=i+1;j<len;j++){
				if(arr[j]<arr[min])
					min = j;
			}
			swap(arr,min,i);
		}
	} 
	public static void main(String[] args) {
		int n = scan.nextInt();
		int[] arr = new int[n];
		for(int i =0;i<n;i++)
			arr[i]=scan.nextInt();
		selectionSort(arr,n);
		for(int i =0;i<n;i++)
			System.out.print(arr[i]+" "); 		
	}
}