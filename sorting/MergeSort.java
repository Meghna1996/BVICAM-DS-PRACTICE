/*
Input 
	6
	-2 23 44 1 2 4
Output
	-2 1 2 4 23 44

*/
//complexity n*log(n)
import java.util.Scanner;

class MergeSort{
	private static Scanner scan = new Scanner (System.in);
	static void mergesort(int[] arr,int l,int h){
		int m=l+(h-l)/2;
		if(l<h){
			mergesort(arr,l,m);
			mergesort(arr,m+1,h);
			merge(arr,l,m,h);
		}
	}
	static void merge(int[] arr,int l,int m,int h){
		int n1=m-l+1,n2=h-m;
		int[] L= new int[n1];
		int[] R= new int[n2];
		for(int i=0;i<n1;i++)
			L[i]=arr[i+l];
		for(int j=0;j<n2;j++)
			R[j]=arr[j+m+1];
		int i=0,j=0;
		int k=l;
		while(i<n1&&j<n2){
			if(L[i]<R[j])
				arr[k++]=L[i++];
			else
				arr[k++]=R[j++];
		}
		while(i<n1){
			arr[k++]=L[i++];
		}
		while(j<n2){
			arr[k++]=R[j++];
		}
	}
	public static void main(String[] args){
		int n = scan.nextInt();
		int[] arr = new int[n];
		for(int i =0;i<n;i++)
			arr[i]=scan.nextInt();
		mergesort(arr,0,n-1);
		for(int i =0;i<n;i++)
			System.out.print(arr[i]+" ");
	}

}