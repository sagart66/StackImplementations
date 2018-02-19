import java.util.*;
public class BalancedParenthesis {
	public static void main(String []args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the expression");
		char[] exp=input.next().toCharArray();
		Stack<Character> mystack=new Stack();
		
		for(char i:exp) {
			
			if(i=='(' || i=='{' || i=='[') 
				mystack.push(i);
			
				
			else if(i=='}') {
				if(mystack.peek()!='{') {
					System.out.println("Unbalanced expression");
					System.exit(0);}
					else 
						mystack.pop();
			}
			else if(i==']') {
				if(mystack.peek()!='[') {
					System.out.println("Unbalanced expression");
					System.exit(0);}
					else 
						mystack.pop();
			}else if(i==')') {
				if(mystack.peek()!='(') {
					System.out.println("Unbalanced expression");
					System.exit(0);}
					else 
						mystack.pop();
			}
			
		}
		if(!mystack.empty()) 
			System.out.println("Unbalanced expression");
		else 
			System.out.println("Balanced Expression");
	
	}
		
		
}
