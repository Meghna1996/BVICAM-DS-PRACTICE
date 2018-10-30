class pattern4{
	static void method(){
		int flagx=1,flagy=7;
		for (int i=0;i<5;i++){
			if(i==0){
				for(int m=0;m<9;m++)
				System.out.print("*");
			}			
			if(i!=0){
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
			for (int i=1;i<5;i++){

			if(i<4){
			for(int j=flagx;j<=5;j++)
				System.out.print("*");
			for(int k=0;k<flagy;k++)
				System.out.print(" ");	
			
			for(int l=flagx;l<=5;l++)
				System.out.print("*");
			}
			if(i==4){
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