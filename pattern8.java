/*
1
4 9 16
25 36 49 64 81
100 121 144 169 196 225 256
289 324 361 400 441 484 529 576 625
*/
C:\Users\miley\Desktop\javaprograms\programs>
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