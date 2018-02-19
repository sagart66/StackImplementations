import java.util.*;
public class ReverseString {
	public static void main(String []args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a string to be reversed");
		char[]  a=input.next().toCharArray();
		Stack<Character> mystack=new Stack();
		for(char i:a) 
			mystack.push(i);
		for(char i:a) {
			System.out.print(mystack.pop()+" ");
		}
		
	}
}
