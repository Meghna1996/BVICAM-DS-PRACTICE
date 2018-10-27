import java.util.Scanner;
class conArray{
	private static Scanner scan= new Scanner(System.in);
	static int gmax(int[] arr, int len){
		int i = 1, gmax = 0, lmax = arr[0];
		while(i<len){
			if(gmax<lmax)
				gmax=lmax;
			if(lmax<0)
				lmax=0;
			lmax = lmax + arr[i];
			i++;
		}

		return gmax;
		
	}
	public static void main(String[] args) {
		System.out.println("Enter the elements");
		int ele = scan.nextInt();
		int[] a = new int[ele];

		//int[] a={2,5,3,-1,-3,4};
		//int len = sizeof(a)/sizeof(a[0]);
		for(int i=0;i<ele;i++)
			a[i] = scan.nextInt();
		int gmax1 = gmax(a,a.length),sum=0;
		System.out.println("The global max "+gmax1);

		for(int i =0; i<a.length; i++){
			sum+=a[i];
			a[i]=-a[i];
		}
		int gmax2 = gmax(a,a.length);
		if(gmax2+sum>gmax1)
			gmax1=sum+gmax2;
		System.out.println("The global max in the continous array "+gmax1);
	}

}