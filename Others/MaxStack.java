 /*
Enter your choice: 1.push 2.pop 3.max 4.else to exit
1
Enter the element 5										//stack 5
Enter your choice: 1.push 2.pop 3.max 4.else to exit
1
Enter the element 3										//stack 5->3
Enter your choice: 1.push 2.pop 3.max 4.else to exit
1
Enter the element 8										//stack 5->3->8
Enter your choice: 1.push 2.pop 3.max 4.else to exit
1
Enter the element 11									//stack 5->3->8->11
Enter your choice: 1.push 2.pop 3.max 4.else to exit
3
maximum 11												//maximum
Enter your choice: 1.push 2.pop 3.max 4.else to exit
2
element popped											//pop
Enter your choice: 1.push 2.pop 3.max 4.else to exit
3
maximum 8												//maximum
Enter your choice: 1.push 2.pop 3.max 4.else to exit
2
element popped											//pop
Enter your choice: 1.push 2.pop 3.max 4.else to exit
3
maximum 5												//maximum
Enter your choice: 1.push 2.pop 3.max 4.else to exit


 */
//space complexity O(1) and time complexity O(1)
import java.util.*;
//import java.io.*;
import java.lang.*;
class MaxStack{
	private static Scanner scan=null;
	static{
		if(scan==null)
			scan = new Scanner(System.in);
	}
		static Stack<Integer> mainstack = new Stack<Integer>();	//main stack
		static int max =0;		
		static void pushmax(int n){			//pushing a element
			if(mainstack.empty())
				max=n;
			if(n>max){
				mainstack.push(2*n-max);
				max=n;
			}
			else
				mainstack.push(n);
		}
		static void peekmax(){			//printing maximum
			if(mainstack.empty())
				System.out.println("empty stack ");
			else
			System.out.println("maximum "+max);
		}
		static void popmax(){				//popping an element
			if(!mainstack.empty()){
				if(mainstack.peek()>max)
					max=2*max-mainstack.peek();
				mainstack.pop();
				System.out.println("element popped");
			}
			else
				System.out.println("empty stack");
		}
		public static void main(String[] args) {
			while(true){
			System.out.println("Enter your choice: 1.push 2.pop 3.max 4.else to exit");
			int ch = scan.nextInt();
			switch(ch){
				case 1:
					System.out.print("Enter the element ");
					int n = scan.nextInt();
					pushmax(n);
					break;
				case 2:
					popmax();
					break;
				case 3:
					peekmax();
					break;
				default:
					System.exit(0);
			}			
		}
		}


}