import java.util.*;
public class EvaluatePostfix {
	public static void main(String []args) {
		Scanner input=new Scanner(System.in);
		int result=0;
		Stack<Integer> mystack = new Stack<Integer>();
		char[] a=input.next().toCharArray();
		for(char i:a) {
			if(!mystack.empty() && !Character.isDigit(i)) {
					if(i=='+') {
					result=mystack.pop()+mystack.pop();
					mystack.push(result);
					}
					else if(i=='-') {
					   result=mystack.pop()-mystack.pop();
					   mystack.push(result);
					   }
					else if(i=='*'){
						result=mystack.pop()*mystack.pop();
						mystack.push(result);
					}
					else if(i=='/') {
						result=mystack.pop()/mystack.pop();
						mystack.push(result);
					}
					else if(i=='^') {
						result=mystack.pop()^mystack.pop();
						mystack.push(result);
					}
			}
			else 
				mystack.push(Integer.parseInt(Character.toString(i)));
			
			
			}
		System.out.println("Result is :"+mystack.pop());
		
		
	}
}
