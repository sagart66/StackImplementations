//stack implementation using array
import java.util.*;
public class usingArray {
	public static void main(String []args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter size of the stack");
		stack mystack=new stack(input.nextInt());
		while(true) {
		System.out.println("Enter your choice\n"
				+ "1. Push element in stack\n"
				+ "2. Pop element from the stack\n"
				+ "3. check stack isEmpty\n"
				+ "4. Size of the stack\n"
				+ "5. Peek element in stack\n");
		
		switch(input.nextInt()) {
		case 1:
			
			mystack.push(input.nextInt());
			break;
		case 2:
			if(!mystack.isEmpty()) {
			System.out.println("Element poped from the stack"+mystack.pop());}
			else System.out.println("Stack is empty");
			break;
		case 3:
			System.out.println("Status of stack isEmpty:"+mystack.isEmpty());
			break;
		case 4:
			System.out.println("Size of the stack is:"+mystack.size());
			break;
		case 5:
			if(!mystack.isEmpty()) {
				System.out.println("Top element in stack is:"+mystack.peek());}
				else System.out.println("Stack is empty");
			break;
			
		
		}
		System.out.print("Printing stack: ");
		mystack.print();
		System.out.println("");
		}	
		
	}
}
class stack {
	int top=-1;
	int a[]= new int[100];	
	int size;
	stack(int size1) {
		size=size1-1;
	}
	void push(int k) {
		if(top>=size) {System.out.println("Stack is full");}
		else {System.out.println("Enter element to be pushed");
		a[++top]=k;
		}
	}
	int pop() {
		if(top<0) {return -100;}
		else
			return a[top--];
	}
	boolean isEmpty() {
		if(top==-1)
			return true;
		return false;
	}
	int size() {
		return top+1;
	}
	int peek() {
		if(top>-1)
		return a[top];
	    return -100;
	}
	void print() {
		if(top==-1)
			System.out.println("Stack is empty");
		for(int i=0;i<=top;i++)
			System.out.print(a[i]+"  ");
		
	}
	
	
}