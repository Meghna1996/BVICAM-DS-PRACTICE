import java.util.Scanner;
class kPair{
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

static void kpair(int[] a,int len,int k){
		int i=0,j=len-1;
		while(i<j){
			if(a[i]+a[j]>k)
				j--;
			if(a[i]+a[j]<k)
				i++;
			if(a[i]+a[j]==k){
				System.out.print("("+a[i]+","+ a[j]+"), ");
					i++;			
					j--;

			}
		}
	}
	public static void main(String[] args) {
		int ele = scan.nextInt();
		int[] a = new int[ele];
		int sum =scan.nextInt();
		for(int i=0;i<ele;i++)
			a[i] = scan.nextInt();
			heapsort(a,ele);
		for(int i=0;i<ele;i++)
			System.out.print(a[i]+" ");
		kpair(a,ele,sum);



	}
}