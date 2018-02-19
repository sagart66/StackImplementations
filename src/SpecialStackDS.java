import java.util.*;
public class SpecialStackDS {
	public static void main(String []args) {
		Scanner input=new Scanner(System.in);
		Stack<Integer>mystack=new Stack();
		Stack<Integer>aux=new Stack();
		System.out.println("1. push\n"
				+ "2. pop\n"
				+ "3. getMin\n");
		while(true) {
		switch(input.nextInt()) {
		
		case 1:
			int a=input.nextInt();
			mystack.push(a);
			if(aux.empty()) {
				aux.push(a);
			}else if(aux.peek()<=a) {
				aux.push(aux.peek());
			}else
				aux.push(a);
			break;
		case 2:
			mystack.pop();
			aux.pop();
			break;
		case 3:
			System.out.println("Min:"+aux.peek());
			break;

		}
		System.out.println("Content of stack: "+mystack);
		
		}
		
	}
}
