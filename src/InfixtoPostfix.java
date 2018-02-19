
import java.util.*;
public class InfixtoPostfix {
	public static void main(String []args) {
		Scanner input=new Scanner(System.in);
		Stack<Character> mystack=new Stack<Character>();
		char[] exp=input.next().toCharArray();
		String result="";
		for(char i:exp) {
			if(Character.isLetterOrDigit(i)) {
				result+=i;
			}else if(i=='(')
				mystack.push(i);
			else if(i==')') {
				
				while(mystack.peek()!='(' && !mystack.empty()) {
					result+=mystack.pop();
				}
				if(!mystack.empty()) {
					mystack.pop();
				}else 
					System.out.println("Invalid Expression");
			//	result+=i;
			}else {
				while( !mystack.empty() && prec(i)<=prec(mystack.peek())) {
					result+=mystack.pop();
				}
				mystack.push(i);
			}
		}
		while(!mystack.empty()) {
			result+=mystack.pop();
		}
		
		
		System.out.println(result);
		
		
		
		
		
	}
	static int prec(char a) {
		switch(a) {
		case '+':
		case '-':
			return 1;
		case '*':
		case '/':
			return 2;
		case '^':
			return 3;
		
		}
		return 0;
	}
	
	
	
}
