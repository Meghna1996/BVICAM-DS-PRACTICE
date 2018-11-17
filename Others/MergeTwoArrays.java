/*
Input
	Enter elements of two arrays
	8
	4
	1 3 4 7 0 0 0 0		
	2 4 5 6
Output 
	1 2 3 4 4 5 6 7

*/
//time complexity O(n) and space complexity O(1) 
import java.util.*;
class MergeTwoArrays{
	private static Scanner scan = new Scanner(System.in);
	static void mergeArrays(int[] a,int[] b,int n, int m){		//merging array b into array a
		int k = n-1;
		int i=n-m-1,j=m-1;
		while(i>=0&&j>=0){
			if(a[i]>b[j]){
				a[k]=a[i];
				i--;
			}
			else{
				a[k]=b[j];
				j--;
			}
			k--;
		}
	}
	public static void main(String[] args) {
		System.out.println("Enter elements of two arrays");
		int n = scan.nextInt();
		int m = scan.nextInt();
		int[] a = new int[n];
		int[] b = new int[m];
		for(int i =0;i<n;i++)
			a[i]=scan.nextInt();
		for(int j=0;j<m;j++)
			b[j]=scan.nextInt();
		mergeArrays(a,b,n,m);
		for(int i:a)
			System.out.print(i+" ");
	}
}