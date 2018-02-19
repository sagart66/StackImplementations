import java.util.*;
public class NextGreaterElement {
	public static void main(String []args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter five elements seperated by space");
		Stack<Integer> mystack=new Stack();
		for(int i=0;i<5;i++) {
			int a=input.nextInt();
			while(!mystack.empty() && a>mystack.peek()) {
				System.out.println(mystack.pop()+"---->"+a);
			}
			mystack.push(a);
			
		}
		while(!mystack.empty()) {
			System.out.println(mystack.pop()+"---->-1");
		}
		
	}
}
