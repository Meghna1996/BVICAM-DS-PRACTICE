/*
Input -
		7
Output-
		7
		76
		765
		7654
		76543
		765432
		7654321

*/

//Complexity n*n
import java.util.Scanner;
class Pattern5{
	private static Scanner scan = new Scanner(System.in);
	static void method(int n){
		for(int i=1;i<=n;i++){						//rows is n
			int k=n;						
			for(int j=1;j<=i;j++){				//till row index
				System.out.print(k);			//print k
				k--;
			}
			System.out.println();
		}

	}
	public static void main(String[] args) {
		int n = scan.nextInt();
		method(n);
	}
}