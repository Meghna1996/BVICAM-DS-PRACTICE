/*
Input-	6
Output-	123456789
		12345678
		123456
		12345
		123
		12
		98
		987
		98765
		987654
		98765432
		987654321
*/

import java.util.Scanner;

class pattern15{
private static Scanner scan = new Scanner(System.in);
	static void method(int n){
		int flag=9;
		for(int i=1;i<=2*n;i++){
			for(int j=1;j<=flag;j++){
				if(i<=n)
					System.out.print(j);
				else
					System.out.print(10-j);
			}
			if(i<n){
				if(i%2!=0)
					flag--;
				else
					flag=flag-2;
			}
			else if(i>n){
				if(i%2!=0)
					flag++;
				else
					flag=flag+2;
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int n = scan.nextInt();
		method(n);
	}
}