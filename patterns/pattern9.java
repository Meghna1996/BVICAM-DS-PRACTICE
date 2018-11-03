/*
Input -
		4
Output 

		12344321
		123**321
		12****21
		1******1

*/
//complexity n * n
import java.util.Scanner;
class Pattern9{
		private static Scanner scan = new Scanner(System.in);
	static void method(int n){
		int flag1=n,flag2=0,flag3=n;
		for ( int i=1 ; i<=n ; i++ ) {
			for ( int j=1 ; j<=flag1 ; j++ ) 
				System.out.print(j);
			flag1--;
			for(int k=1;k<=flag2;k++)
				System.out.print("*");
			flag2=flag2+2;
			for(int l=flag3;l>=1;l--)
				System.out.print(l);
			flag3--;
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int n = scan.nextInt();
		method(n);
	}
}