import java.util.Scanner;
class KLargestEleMinHeap{
	private static Scanner scan = new Scanner(System.in);
	static void heapify(int[] a,int len, int root){
		int min=root;			
		int l=2*root+1;			//index of left children of root
		int r=2*root+2;			//index of right childer of root
		if(l<len&&a[l]<a[min])
			min=l;
		if(r<len&&a[r]<a[min])
			min=r;
		if(min!=root){			//if the index of max is at any children then swap max and root
			int temp = a[min];
			a[min]=a[root];
			a[root]=temp;
			heapify(a,len,min);		//heapify after swapping
		}
	}
	static void kLargestEleMinHeap(int[] arr,int k,int len){
		int[] temp = new int[k];
		int i = 0;
		for( i=0;i<k;i++)
			temp[i]=arr[i];
		i=len-k+1;
		heapify(temp,k,0);
		while(i<len){
			if(arr[i]>temp[0]){
				temp[0]=arr[i];
				heapify(temp,k,0);
			}
			i++;
		}
		for(i=0;i<k;i++)
			System.out.print(temp[i]+" ");
	}
	public static void main(String[] args) {
		int n = scan.nextInt();
		int[] arr = new int[n];
		for(int i =0;i<n;i++)
			arr[i]=scan.nextInt();
		kLargestEleMinHeap(arr,3,n);

	}
}