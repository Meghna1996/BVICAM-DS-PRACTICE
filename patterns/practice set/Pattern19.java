/*
Input 
		5 
output 

    1
   2 2
  3   3
 4     4
5       5
 4     4
  3   3
   2 2
    1

*/
//complexity n * n
import java.util.Scanner;
class Pattern19{
	private static Scanner scan = new Scanner(System.in);
	static void displayPattern(int n){
		int flag1=n-1,flag2=1,flag3=1;
		for(int i =1; i<=2*n-1;i++){
			if(i<=n){								//for rows till half way
				int k=1,j=1;
				while(j<=flag1){						//spaces before number
					System.out.print(" ");
					j++;
				}
				if(i==1)								//printing first number
					System.out.print("1");
				else{
					System.out.print(i);
					while(k<=flag2){
						System.out.print(" ");			//for spaces after number
						k++;
					}
					System.out.print(i);				//printing second number
					flag2=flag2+2;
				}
				flag1--;

			}
			else{								//for rows after half way

				int j=1,k=1;
				while(j<=flag1+2){
					System.out.print(" ");			//spaces before number
					j++;		
				}
				if(i==2*n-1)
					System.out.print("1");			//ptining first number
				else{
					System.out.print(i-2*flag3);
					while(k<=flag2-4){
						System.out.print(" ");		//printing spaces after number
						k++;
					}
					System.out.print(i-2*flag3);			//printing second number
					flag3++;
					flag2=flag2-2;
				}
				flag1++;
			}


			
			System.out.println();

		}
	}
	public static void main(String[] args) {
		int n = scan.nextInt();
		displayPattern(n);
	}
}