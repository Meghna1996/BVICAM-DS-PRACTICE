/*
Input	5
Output	
		1
		121
		12321
		1234321
		123454321
		*/
//complexity n * n
import java.util.Scanner;
class Pattern12{
	private static Scanner scan = new Scanner(System.in);
	static void method(int n){
		int flag=1;
		for(int i=1;i<=n;i++){
				int count=1;
			for(int j=1;j<=flag;j++){
				if(j<=i)
					System.out.print(j);
				else{

					System.out.print(j-2*count);
					count++;
				}


			}
			flag=flag+2;

			System.out.println();
		}
	}
	public static void main(String[] args) {
		int n = scan.nextInt();
		method(n);
	}
}
