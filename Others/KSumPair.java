/*
Input	5				- no of elements
		5				- sum 
		-1 5 6 0 2		- array

Output	(-1,6), (0,5),	- pairs
*/
import java.util.Scanner;
class KSumPair{
	private static Scanner scan = new Scanner(System.in);
	static void heapsort(int[] a,int len){
		int root = len/2 - 1;			//rightmost parent before root
		for(int i=root;i>=0;i--)
			heapify(a,len,i);
		for(int i=len-1;i>=0;i--){
			int temp = a[i];		//swapping first and last element of heap
			a[i]=a[0];
			a[0]=temp;
			heapify(a,i,0);	//heapify after swapping
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

static void kpair(int[] a,int len,int k){
		int i=0,j=len-1;
		while(i<j){
			if(a[i]+a[j]>k)				//if sum if greater than the result required
				j--;
			if(a[i]+a[j]<k)				//if sum is less than the result required 
				i++;
			if(a[i]+a[j]==k){
				System.out.print("("+a[i]+","+ a[j]+"), ");		//if sum is found
					i++;			
					j--;
			}
		}
	}
	public static void main(String[] args) {
		int ele = scan.nextInt();		//no of elements
		int[] a = new int[ele];		
		int sum =scan.nextInt();		//sum
		for(int i=0;i<ele;i++)
			a[i] = scan.nextInt();		//input array
			heapsort(a,ele);			// heap sort called
		//for(int i=0;i<ele;i++)
			//System.out.print(a[i]+" ");
		kpair(a,ele,sum);				//method to find the pairs called on sorted array



	}
}