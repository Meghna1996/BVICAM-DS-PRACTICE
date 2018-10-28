import java.util.Scanner;

class KLargestEle{
	private static Scanner scan = new Scanner(System.in);
	static void heapsort(int[] a,int len,int k){
		int flag = 0;
		int root = len/2 - 1;
		for(int i=root;i>=0;i--)
			heapify(a,len,i);
		for(int i=len-1;i>=0;i--){
			if(flag==k)
				break;
			int temp = a[i];
			a[i]=a[0];
			a[0]=temp;
			heapify(a,i,0);	
			flag++;
		}
	}

	static void heapify(int[] a,int len, int root){
		int max=root;
		int l=2*root+1;
		int r=2*root+2;
		if(l<len&&a[l]>a[max])
			max=l;
		if(r<len&&a[r]>a[max])
			max=r;
		if(max!=root){
			int temp = a[max];
			a[max]=a[root];
			a[root]=temp;
			heapify(a,len,max);
		}
	}
	public static void main(String[] args) {
		System.out.println("Enter number of elements in array");
		int ele = scan.nextInt();
		int[] arr = new int[ele];

		System.out.println("Enter array elements");
		for(int i=0;i<ele;i++)
			arr[i] = scan.nextInt();

		System.out.println("Enter the value for k");
		int k =scan.nextInt();
		
		heapsort(arr,arr.length,k);
		int i;
		System.out.println("Largest Element");	
		i=arr.length-k;
		while(k>0){
			System.out.print(arr[i]+" ");
			i++;
			k--;
		}
	}

}