/*
Input-	5
Output-	* * * * *
		 * * * *
		  * * *
		   * *
		    *
*/
import java.util.Scanner;
class pattern13{
	private static Scanner scan = new Scanner(System.in); 
	static void method(int n){
		//int flag=5;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				if(j<i)
					System.out.print(" ");
				else
					System.out.print("* ");
			}
			//flag++;
			System.out.println();
		}

	}
	public static void main(String[] args) {
		int n = scan.nextInt();
		method(n);
	}
}