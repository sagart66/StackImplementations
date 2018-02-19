import java.util.*;
public class RemoveMiddleElemet {
	public static void main(String []args) 
	{
		Scanner input=new Scanner(System.in);
		Stack<Integer>mystack=new Stack();
		
		System.out.println("1. push\n"
				+ "2. pop\n"
				+ "3. deleteMiddle\n");
		while(true) {
		switch(input.nextInt()) {
		
		case 1:
			
			mystack.push(input.nextInt());
			
			break;
		case 2:
			mystack.pop();
			
			break;
		case 3:
			mystack.remove((int)mystack.size()/2);
			break;

		}
		System.out.println("Content of stack: "+mystack);
		
		}
		
		
		
		
		
		
		
		
	}
}
