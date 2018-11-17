/*
Enter your choice: 1.push 2.pop 3.Min 4.else to exit
1
Enter the element 5
Enter your choice: 1.push 2.pop 3.Min 4.else to exit
1
Enter the element 4
Enter your choice: 1.push 2.pop 3.Min 4.else to exit
1
Enter the element 3
Enter your choice: 1.push 2.pop 3.Min 4.else to exit
1
Enter the element 2
Enter your choice: 1.push 2.pop 3.Min 4.else to exit
3
Minimum 2
Enter your choice: 1.push 2.pop 3.Min 4.else to exit
2
element popped
Enter your choice: 1.push 2.pop 3.Min 4.else to exit
3
Minimum 3
Enter your choice: 1.push 2.pop 3.Min 4.else to exit
2
element popped
Enter your choice: 1.push 2.pop 3.Min 4.else to exit
3
Minimum 4

*/

//space complexity O(1) and time complexity O(1)
 
import java.util.*;
//import java.io.*;
import java.lang.*;
class MinStack{
	private static Scanner scan=null;
	static{
		if(scan==null)
			scan = new Scanner(System.in);
	}
		static Stack<Integer> mainstack = new Stack<Integer>();	//main stack
		static int min =0;		
		static void pushMin(int n){			//pushing a element
			if(mainstack.empty())
				min=n;
			if(n<min){
				mainstack.push(2*n-min);
				min=n;
			}
			else
				mainstack.push(n);
		}
		static void peekMin(){				//printing minimum
			System.out.println("Minimum "+min);
		}
		static void popMin(){				//popping an element
			if(!mainstack.empty()){
				if(mainstack.peek()<min)
					min=2*min-mainstack.peek();
				mainstack.pop();
				System.out.println("element popped");
			}
			else
				System.out.println("empty stack");
		}
		public static void main(String[] args) {
			while(true){
			System.out.println("Enter your choice: 1.push 2.pop 3.Min 4.else to exit");
			int ch = scan.nextInt();
			switch(ch){
				case 1:
					System.out.print("Enter the element ");
					int n = scan.nextInt();
					pushMin(n);
					break;
				case 2:
					popMin();
					break;
				case 3:
					peekMin();
					break;
				default:
					System.exit(0);
			}			
		}
		}


}