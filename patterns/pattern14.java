/*
Input-	6
Output-	
		******
		 *****
		  ****
		   ***
		    **
		     *
		    **
		   ***
		  ****
		 *****
		******
*/
//complexity n * n

import java.util.Scanner;
class Pattern14{
	private static Scanner scan = new Scanner(System.in);
	static void method(int n){
		int count=1;
		for(int i=1;i<=2*n-1;i++){
			for(int j=1;j<=n;j++){
				if(i<=n){
					if(j<i)
						System.out.print(" ");
					else
						System.out.print("*");

				}
				else{
					if(j<i-count*2)
						System.out.print(" ");
					else
						System.out.print("*");
				}

			}
			if(i>n)
				count++;
				
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int n = scan.nextInt();
		method(n);
	}
}