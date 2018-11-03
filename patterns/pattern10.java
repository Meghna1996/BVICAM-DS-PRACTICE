/*
Input- 5
Output-
    *   *
   **   **
  ***   ***
 ****   ****
*****---*****
*****---*****
 ****   ****
  ***   ***
   **   **
    *   *
*/
//Complexity n * n
import java.util.Scanner;
class Pattern10{
	private static Scanner scan = new Scanner(System.in);
	static void method(int n){
		int flag1=n-1,flag2=1,i;
		for( i=1;i<=2*n;i++){
			for(int j=1;j<=flag1;j++)
				System.out.print(" ");
			for(int k=1;k<=flag2;k++)
				System.out.print("*");
			if(i==n||i==n+1)
				System.out.print("---");
			else
				System.out.print("   ");
			for(int m=1;m<=flag2;m++)
				System.out.print("*");
			if(i<n){
				flag2++;
				flag1--;
			}
			else if(i>n){
				flag2--;
				flag1++;
			}
			System.out.println();
		}

	}
	public static void main(String[] args) {
		int n = scan.nextInt();
		method(n);
	}
}