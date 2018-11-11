import java.util.Scanner;
class ReverseStringRecursion{
	private static Scanner scan = new Scanner(System.in);
	static String swapString(String str, int low,int high){
		char[] str1 = str.toCharArray();
		char temp = str.charAt(low);
		str1[low]=str1[high];
		str1[high]=temp;
		 str = str1.toString();
		return str;

	}
	static String reverse(String str,int low, int high){
		//String str1=str;
		if(low<high){
			str=swapString(str,low,high);
		return	reverse(str,++low,--high);
		}
		else
			return str;
	}
	public static void main(String[] args) {
		String str = scan.next();
		int len =str.length()-1;
		str =reverse(str,0,len);
		System.out.print(str);
	}
}