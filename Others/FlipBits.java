import java.util.Scanner;
class FlipBits{
	private static Scanner scan = new Scanner(System.in);
	static int flipbits(int a,int b){
		int c=a^b;
		int count=0;
		do{
			if(c%2==1)
				count++;
			c=c/2;
		}while(c>0);
		return count;
	}
	public static void main(String[] args) {
		int a = scan.nextInt();
		int b = scan.nextInt();
		int count= flipbits(a,b);
		System.out.print(count);
	}
}
