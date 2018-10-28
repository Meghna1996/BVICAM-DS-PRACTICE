class pattern7{
	static void method(){
		int flag=1;
		int flag2=7;
		for(int i=1;i<=9;i++){
			if(i<=5){
				for(int j=1;j<=flag;j++)
					System.out.print(j);
				flag=flag+2;			
			}
			else{
				for(int k=1;k<=flag2;k++)
					System.out.print(k);
				flag2=flag2-2;
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		method();
	}
}