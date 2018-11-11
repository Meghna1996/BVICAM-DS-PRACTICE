/*
5
20 234 -29 32 21
-29 20 21 32 234
*/
//complexity n*logn
import java.util.Scanner;
class HeapSort{
	private static Scanner scan = new Scanner(System.in);
	static void heapsort(int[] a,int len){					
		int root = len/2 - 1;			
		for(int i=root;i>=0;i--)
			heapify(a,len,i);
		for(int i=len-1;i>=0;i--){
			int temp = a[i];
			a[i]=a[0];				
			a[0]=temp;
			heapify(a,i,0);			
		}
	}

	static void heapify(int[] a,int len, int root){
		int max=root;			
		int l=2*root+1;			//index of left children of root
		int r=2*root+2;			//index of right childer of root
		if(l<len&&a[l]>a[max])
			max=l;
		if(r<len&&a[r]>a[max])
			max=r;
		if(max!=root){			//if the index of max is at any children then swap max and root
			int temp = a[max];
			a[max]=a[root];
			a[root]=temp;
			heapify(a,len,max);		//heapify after swapping
		}
	}
	public static void main(String[] args) {
		int n = scan.nextInt();
		int[] arr = new int[n];
		for(int i =0;i<n;i++)
			arr[i]=scan.nextInt();
		heapsort(arr,n);
		for(int i =0;i<n;i++)
			System.out.print(arr[i]+" "); 
	}

}