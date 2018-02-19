import java.util.*;
public class ReverseUsingRecurssion {
	public static void main(String []args) {
		Scanner input=new Scanner(System.in);
		Stack<Integer> mystack=new Stack();
		System.out.println("Enter five Integers");
		for(int i=0;i<5;i++)
		mystack.push(input.nextInt());
		reverse(mystack);
		System.out.println(mystack);

	}
	static void reverse(Stack<Integer> mystack) {
		if(!mystack.empty()) 
		{
			int data=mystack.pop();
			reverse(mystack);
			mystack.add(0,data);
		}
	
	}
}

