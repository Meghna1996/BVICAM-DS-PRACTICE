/*
Input-
		Enter the number of elements
		5
		2 3 -3 -5 2
Output-
		The global max 5
		The global max in the circular array 7
*/

import java.util.Scanner;
class ConArray{
	private static Scanner scan= new Scanner(System.in);
	static int gmax(int[] arr, int len){			//function for finding continous max in array
		int i = 1, gmax = 0, lmax = arr[0];
		while(i<=len){			//iterating till length of array
			if(gmax<lmax)
				gmax=lmax;		//if previous max is less than new max then change value
			if(lmax<0)
				lmax=0;
			lmax = lmax + arr[i];	//using local max to find the sum of continous array
			i++;
		}

		return gmax;		//return max
	}	
	
	public static void main(String[] args) {
		System.out.println("Enter the number of elements");
		for(int i=0;i<ele;i++)
			a[i] = scan.nextInt();
		int gmax1 = gmax(a,a.length-1),sum=0;		//finding continous max
		System.out.println("The global max "+gmax1);

		for(int i =0; i<a.length; i++){
			sum+=a[i];				//findind the sum of array
			a[i]=-a[i];		//making the elements negetive		
		}
		int gmax2 = gmax(a,a.length-1);	//finding continous max again
		if(gmax2+sum>gmax1)			
			gmax1=sum+gmax2;		//cancelling out negetive elements from sum using gmax2
		System.out.println("The global max in the circular array "+gmax1);
	}
}
