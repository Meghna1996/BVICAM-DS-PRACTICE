class pattern9{
	static void method(){
		int flag1=4,flag2=0,flag3=4;
		for ( int i=1 ; i<=4 ; i++ ) {
			for ( int j=1 ; j<=flag1 ; j++ ) 
				System.out.print(j);
			flag1--;
			for(int k=1;k<=flag2;k++)
				System.out.print("*");
			flag2=flag2+2;
			for(int l=flag3;l>=1;l--)
				System.out.print(l);
			flag3--;
			System.out.println();

		}

	}
	public static void main(String[] args) {
		method();
	}
}