import java.util.*;
public class SortUsingRecurssion {
	public static void main(String []args) {
		Scanner input = new Scanner(System.in);
		
		Stack<Integer> mystack=new Stack();
		System.out.println("Enter five Integers");
		for(int i=0;i<5;i++)
		mystack.push(input.nextInt());
		sort(mystack);
		System.out.println(mystack);
	}
	static void sort(Stack<Integer> mystack) {
		if(!mystack.empty()) {
			int data=mystack.pop();
			sort(mystack);
			sortedInsert(mystack,data);
			
		}
		
		
		
	}
	static void sortedInsert(Stack<Integer> mystack, int data) {
		if(mystack.empty() || mystack.peek()<data) 
				mystack.push(data);
			else {
				int temp=mystack.pop();
				sortedInsert(mystack,data);
				//sortedInsert(mystack,temp);
				mystack.push(temp);	
			}
			
			
			
		
		
		
		
		

	}
}
