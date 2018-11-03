/*
Input 
		5
Output

		*
		***
		*****
		*******
		*********
*/
//complexity n*n
		
import java.util.Scanner;
class Pattern6{
	private static Scanner scan = new Scanner(System.in);
	static void method(int n){
		int flag=1;
		for(int i=1;i<=n;i++){			// n rows
			for(int j=1;j<=flag;j++)	
				System.out.print("*");
			flag=flag+2;				//incrementing length of each row by 2
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int n = scan.nextInt();
		method(n);
	}
}