/*
7
76
765
7654
76543
765432
7654321
*/
C:\Users\miley\Desktop\javaprograms\programs>
class pattern5{
	static void method(){
		for(int i=1;i<=7;i++){
			int k=7;
			for(int j=1;j<=i;j++){
				System.out.print(k);
				k--;
			}
			System.out.println();
		}

	}
	public static void main(String[] args) {
		method();
	}
}