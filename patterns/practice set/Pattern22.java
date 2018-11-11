/*
Input
	5
output 
	1       1
	 2     2
	  3   3
	   4 4
	    5
	   4 4
	  3   3
	 2     2
	1       1
*/
//complexity n * n 
import java.util.Scanner;

class Pattern22{
	private static Scanner scan = new Scanner(System.in);
	static void displayPattern(int n ){
		int flag1=1,flag2=(n-2)*2+1,flag3=1;
		for(int i=1;i<=2*n-1;i++){
			int j=1;
			while(j<flag1){
				System.out.print(" ");
				j++;
			}
			if(i==n){
				System.out.print(i);
			}
			else{
				int k=1;
				if(i<n){
					System.out.print(i);
					while(k<=flag2){
						System.out.print(" ");
						k++;
					}
					System.out.print(i);
					
				}
				else{
					System.out.print(i-2*flag3);
					while(k<=flag2){
						System.out.print(" ");
						k++;
					}
					System.out.print(i-2*flag3);
					flag3++;
					
				}
			}
			if(i<n)
				{flag1++;flag2=flag2-2;}
			else{
			flag1--;flag2=flag2+2;
			} 
			System.out.println();	

		}
		


	}
	public static void main(String[] args) {
		int n = scan.nextInt();
		displayPattern(n);
	}
}