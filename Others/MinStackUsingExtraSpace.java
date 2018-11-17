/*
Enter your choice: 1.push 2.pop 3.Min 4.else to exit
1
Enter the element
4
Enter your choice: 1.push 2.pop 3.Min 4.else to exit
1
Enter the element
6
Enter your choice: 1.push 2.pop 3.Min 4.else to exit
1
Enter the element
2
Enter your choice: 1.push 2.pop 3.Min 4.else to exit
1
Enter the element
1
Enter your choice: 1.push 2.pop 3.Min 4.else to exit
3
Minimum: 1
Enter your choice: 1.push 2.pop 3.Min 4.else to exit
2
element popped
Enter your choice: 1.push 2.pop 3.Min 4.else to exit
3
Minimum: 2
*/
//time complexity O(1) & space complexity O(n)
import java.util.*;
//import java.io.*;
import java.lang.*;
class MinStackUsingExtraStack{
	private static Scanner scan = new Scanner(System.in);
		static Stack<Integer> mainstack = new Stack<Integer>();		//main stack that maintains the elements push and pop
		static Stack<Integer> minstack = new Stack<Integer>();		//min stack that maintains the minimum element for each push and pop
	static void pushMin(int n){
		mainstack.push(n);		//pushing in main stack
		if(minstack.empty())
			minstack.push(n);		
		else{
			if (minstack.peek()>n)	//if min stack top is greater than new element then push 
				minstack.push(n);	
			}
	}
	static void peekMin(){
		System.out.println("Minimum: "+minstack.peek());	//printing top of min stack
	}
	static void popMin(){
		if(!mainstack.empty()){
			if(mainstack.peek()==minstack.peek()){		//if top is same for both then pop
				mainstack.pop();
				minstack.pop();
			}
			else
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
					System.out.println("Enter the element");
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