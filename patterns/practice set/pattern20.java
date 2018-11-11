/*
Input 
		5
Output
0
0 2
0 3 6
0 4 8 12
0 5 10 15 20
*/
//complexity n * n
import java.util.Scanner;
class Pattern20{
	private static Scanner scan =new Scanner(System.in);
	static void displayPattern(int n){
			for(int i =1;i<=n;i++){
				for(int j=0;j<i;j++){
					System.out.print(j*i+" ");
				}
				System.out.println();
			}
	}
	public static void main(String[] args) {
		int n = scan.nextInt();
		displayPattern(n);
	}
}