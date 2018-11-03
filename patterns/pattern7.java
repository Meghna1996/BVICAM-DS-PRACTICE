/*
Input
		9
Output

		1
		123
		12345
		1234567
		123456789
		1234567
		12345
		123
		1
*/

//complexity n * n
import java.util.Scanner;
class Pattern7{
	private static Scanner scan = new Scanner(System.in);
	static void method(int n){
		int flag=1;
		int flag2=n-2;
		for(int i=1;i<=n;i++){
			if(i<=n/2+1){				// for first half rows
				for(int j=1;j<=flag;j++)
					System.out.print(j);
				flag=flag+2;			//incrementing the numbers
			}
			else{					//next half rows
				for(int k=1;k<=flag2;k++)
					System.out.print(k);
				flag2=flag2-2;			//decrementing numbers
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int n =scan.nextInt();
		method(n);
	}
}