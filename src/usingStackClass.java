//stack implementation using stack class in java
import java.util.Stack;
import java.util.Scanner;
public class usingStackClass {
	public static void main(String []args) {
		Scanner input=new Scanner(System.in);
		Stack<Integer> mystack= new Stack<Integer>();
		while(true) {
			System.out.println("Enter your choice\n"
					+ "1. Push element in stack\n"
					+ "2. Pop element from the stack\n"
					+ "3. check stack isEmpty\n"
					+ "4. Search element in the stack\n"
					+ "5. Peek element in stack\n"
					+ "6. Size of the stack\n"
					+ "7. Delete all the elements in the stack\n");
			
			switch(input.nextInt()) {
			case 1:
				
				mystack.push(input.nextInt());
				break;
			case 2:
				if(!mystack.empty()) {
				System.out.println("Element poped from the stack"+mystack.pop());}
				else System.out.println("Stack is empty");
				break;
			case 3:
				System.out.println("Status of stack isEmpty:"+mystack.empty());
				break;
			case 4:
				System.out.println("Enter element to be searched in stack");
				int var=mystack.search(input.nextInt());
				System.out.println("Index of the element in stack is:"+var);
				break;
			case 5:
				if(!mystack.empty()) {
					System.out.println("Top element in stack is:"+mystack.peek());}
					else System.out.println("Stack is empty");
				break;
			case 6:
				System.out.println("Size of the stack is"+mystack.size());
			break;
			case 7:
				mystack.clear();
				break;
			}
			System.out.println("Printing stack: "+mystack);
			
			}	
			
		}
		
		
		
		
		
		
		
	}

