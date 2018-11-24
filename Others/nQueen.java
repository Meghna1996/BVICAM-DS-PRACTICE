import java.util.Scanner;
class nQueen{
	private static Scanner scan = new Scanner(System.in);
	static boolean check(int[][] matrix,int r,int c,int n){
		int i=r-1,j=c;
		while(i>=0){
			if(matrix[i--][j]==1)
				return false;
			}
		i=r-1;
		j=c-1;
		while(i>=0&&j>=0){
			if(matrix[i--][j--]==1)
				return false;
		}
		i=r-1;
		j=c+1;
		while(i>=0&&j<n){
			if(matrix[i--][j++]==1)
				return false;
		}
		return true;
	}
	static boolean nqueen(int[][] matrix,int r,int  n){
		boolean flag = false;
		if(r==n){
			//System.out.print("true");
			return true;
		}
		else
		{
			for(int i=0;i<n;i++)
			{
				matrix[r][i]=1;
				if(check(matrix,r,i,n))
					flag = nqueen(matrix,r+1,n);
				if(flag==true)return flag;
				matrix[r][i]=0;

			}
		}
		return false;
	}
	public static void main(String[] args) {
		int n = scan.nextInt();
		int[][] matrix = new int[n][n] ;
	//	int i=0;
		nqueen(matrix,0,n);
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++)
				System.out.print(matrix[i][j]+" ") ;
			System.out.println();
		}
}
}

