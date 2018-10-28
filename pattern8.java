class pattern8{
	static void method(){
		int flag=1,k=1;
		for(int i=1;i<=5;i++){
			for(int j=1;j<=flag;j++){
				System.out.print(k*k+" ");
			k++;
			}
			flag=flag+2;
		System.out.println();
		}
	}
	public static void main(String[] args) {
		method();
	}
}