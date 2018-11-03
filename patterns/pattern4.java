/*
*********
**** ****
***   ***
**     **
*       *
**     **
***   ***
**** ****
*********
*/

//complexity n*n
class Pattern4{
	static void method(){
		int flagx=1,flagy=7;
		for (int i=0;i<5;i++){
			if(i==0){
				for(int m=0;m<9;m++)
				System.out.print("*");		//first row
			}			
			if(i!=0){						//for incrementing spaces and decrementing * till 5th row
			for(int j=flagx;j<=5;j++)
				System.out.print("*");
			for(int k=9;k<=flagy;k++)
				System.out.print(" ");	
			for(int l=flagx;l<=5;l++)
				System.out.print("*");
			}

			flagx++;
			flagy=flagy+2;	
			System.out.println();
		}

		flagx=4;
		flagy=5;

		for(int i=1;i<5;i++){			//for incrementing * and decrementing spaces till last row
			if(i<4){
			for(int j=flagx;j<=5;j++)
				System.out.print("*");
			for(int k=0;k<flagy;k++)
				System.out.print(" ");	
			
			for(int l=flagx;l<=5;l++)
				System.out.print("*");
			}
			if(i==4){					//last row
				for(int m=0;m<9;m++)
					System.out.print("*");		
			}	
			flagx--;
			flagy=flagy-2;	
			System.out.println();
		}

	}
	public static void main(String[] args) {
		method();
	}
}