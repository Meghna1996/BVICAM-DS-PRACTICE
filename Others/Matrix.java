/*
Input
		5
Output
		1 2 3 4 5 10 15 20 25 24 23 22 21 16 11 6 7 8 9 14 19 18 17 12 13
Input 
		4
Output
		1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10
*/
//complexity n * n
import java.util.Scanner;

class MatrixPrintCircular{
private static Scanner scan = new Scanner(System.in);
	static void printMatrix(int[][] arr,int n){
		int col=0,row=0,flag1=n,flag2=n,flag3=0,flag4=0;
	n=(int)Math.ceil((double)n/2);
	for(int i=1;i<=n;i++){						//outer loop for printing around the matrix once

		while(col<flag1){						//top row
			System.out.print(arr[row][col]+" ");
			col++;
		}
		col--;row++;
		while(row<flag2){					//right column
			System.out.print(arr[row][col]+" ");
			row++;
		}
		row--;col--;
		while(col>=flag3){						//bottom row
			System.out.print(arr[row][col]+" ");
			col--;
		}				
		col++;row--;		
		while(row>flag4){					//left column
			System.out.print(arr[row][col]+" ");
			row--;
		}
		row++;col++;
		flag1--;
		flag2--;
		flag3++;
		flag4++;
	}
	}
	public static void main(String[] args) {
		int n = scan.nextInt();				//size of nXn matrix
		int[][] arr = new int[n][n];
		int a=1;
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++)	
				arr[i][j]=a++;			//assigning the values from 1 till nXn
		}
		
		printMatrix(arr,n);					//calling the printing method
	}
}