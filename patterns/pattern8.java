/*
Input - 
		5
Output 

		1
		4 9 16
		25 36 49 64 81
		100 121 144 169 196 225 256
		289 324 361 400 441 484 529 576 625
*/
//complexity n * n 
import java.util.Scanner;
class Pattern8{
	private static Scanner scan = new Scanner(System.in);
	static void method(int n){
		int sqaure=1;
		for(int i=0;i<n;i++){
			for(int j=1;j<=2*i+1;j++){
				System.out.print(sqaure*sqaure+" ");
			sqaure++;
			}
	//		flag=flag+2;			//incrementing the number of elements in each row
		System.out.println();
		}
	}
	public static void main(String[] args) {
		int n = scan.nextInt();
		method(n);
	}
}