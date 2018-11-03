//incomplete yet to be done
import java.util.Scanner;
class Pattern17{
private static Scanner scan = new Scanner(System.in);
	static void method(int n){
		for(int i=1;i<=2*n+2;i++){
			for(int j=1;j<=n;j++){
				if(i<=n){
					if(j<i)
						System.out.print(" ");
					else 
						System.out.print("10");
				}
				else if(i==n+1){
					if(j<i)
						System.out.print(" ");
					else
						System.out.print("1");
				}
				else if(i==n+2){
					if(j<i-n)
						System.out.print(" ");
					else
						System.out.print("0");
				}
				else{
					if(j<i-n)
						System.out.print(" ");
					else
						System.out.print("10");

				}

			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int n = scan.nextInt();
		method(n);
	}
}