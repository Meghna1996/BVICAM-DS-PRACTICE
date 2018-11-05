/*
Input
	5
	10 1 2 8 9
Output
	Buy at 1 and sell at 4 
*/
//Complexity n
import java.util.Scanner;
class BuySellShare{
	private static Scanner scan = new Scanner(System.in);
	static void diff(int[] arr,int len){
		int min=0,max=0,max2=0,min2=0;
		for(int i=1;i<len;i++){
			if(arr[min]>arr[i])
				min=i;
			if(arr[i]-arr[min]>max){
				max2=i;
				max=arr[i]-arr[min];
				min2=min;
			}
		}
		System.out.print("Buy at "+min2+" and sell at "+max2);
	}

	public static void main(String[] args) {
		int n = scan.nextInt();
		int[] arr= new int[n];
		for(int i=0;i<n;i++)
			arr[i]=scan.nextInt();
		diff(arr,n);

			
	}
}