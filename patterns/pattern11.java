/*
Input-   6
Output-   1
         1 2
        1 2 3
       1 2 3 4
      1 2 3 4 5
     1 2 3 4 5 6
      2 3 4 5 6
       3 4 5 6
        4 5 6
         5 6
          6

*/
// complexity n *n
import java.util.Scanner;
class Pattern11{
	private static Scanner scan = new Scanner(System.in);
	static void method(int n){
		int flag1 = 2*n-2, flag2 = 1;
		for(int i=1;i<=2*n-1;i++){
			for(int j=1;j<=flag1;j++)
				System.out.print(" ");
			for(int k=1;k<=flag2;k++){
				if(i<=n)
					System.out.print(k+" ");
				else
					System.out.print((i-n+k)+" ");
			}
			if(i<n){
				flag1--;flag2++;
			}
			else{
				flag1++;flag2--;
			}
			System.out.println();
		} 
	}
	public static void main(String[] args) {
		int n = scan.nextInt();
		method(n);
	}
}