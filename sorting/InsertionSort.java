/*
5
20 234 -29 32 21
-29 20 21 32 234
*/
//complexity n * n
import java.util.Scanner;
class InsertionSort{
	private static Scanner scan = new Scanner(System.in);
	static void insertionSort(int[] arr,int len){
		int key,j;
		for(int i=1;i<len;i++){
			key=arr[i];
			j=i-1;
			while(j>=0&&arr[j]>key){
				arr[j+1]=arr[j];
				j--;
			}	
			arr[j+1]=key;
		}
	}
	public static void main(String[] args) {
		int n = scan.nextInt();
		int[] arr = new int[n];
		for(int i =0;i<n;i++)
			arr[i]=scan.nextInt();
		insertionSort(arr,n);
		for(int i =0;i<n;i++)
			System.out.print(arr[i]+" "); 	
	}
}