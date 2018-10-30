/*

*
***
*****
*******
*********
*/
C:\Users\miley\Desktop\javaprograms\programs>
class pattern6{
	static void method(){
		int flag=1;
		for(int i=1;i<=5;i++){
			for(int j=1;j<=flag;j++)
				System.out.print("*");
			flag=flag+2;
			System.out.println();
		}
	}
	public static void main(String[] args) {
		method();
	}
}