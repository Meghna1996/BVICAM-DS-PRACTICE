/*
input 
		6
output
		
 1  2  3  4  5  6
 20  21  22  23  24  7
 19  32  33  34  25  8
 18  31  36  35  26  9
 17  30  29  28  27  10
 16  15  14  13  12  11

*/
//complexity n * n
 //space complexity n * n
import java.util.Scanner;
class Pattern18{
	private static Scanner scan = new Scanner(System.in);
	static void patternDisplay(int n){
		int col=0,row=0,flag1=n,flag2=n,flag3=0,flag4=0,count=1;
		int[][] arr = new int[n][n];
		int num=(int)Math.ceil((double)n/2);
		for(int i=1;i<=num;i++){						//outer loop for printing around the matrix once

			while(col<flag1){						//top row
				arr[row][col]=count;
				count++;
				col++;
			}
			col--;row++;
			while(row<flag2){					//right column
				arr[row][col]=count;
				count++;
				row++;
			}
			row--;col--;
			while(col>=flag3){						//bottom row
					arr[row][col]=count;
				count++;			
				col--;
			}				
			col++;row--;		
			while(row>flag4){					//left column
				arr[row][col]=count;
				count++;				
				row--;
			}
			row++;col++;
			flag1--;
			flag2--;
			flag3++;
			flag4++;
		
		}
		for(int i=0;i<n;i++){
			for(int j =0;j<n;j++)
				System.out.print(" "+arr[i][j]+" ");
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int n = scan.nextInt();
		patternDisplay(n);
	}
}