/*
Input-			5
Output-		    *
			   * *
			  * * *
			 * * * *
			* * * * *
			 * * * *
			  * * *
			   * *
			    *
*/

import java.util.Scanner;

class pattern16{
private static Scanner scan = new Scanner(System.in);
	static void method(int n){
		for(int i=1;i<=2*n;i++){
			for(int j=1;j<=n;j++){
				if(i<=n){
					if(j<=n-i)
						System.out.print(" ");
					else
						System.out.print("* ");
				}
				else{
					if(j<=i-n)
						System.out.print(" ");
					else
						System.out.print("* ");
				}
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int n = scan.nextInt();
		method(n);
	}
}