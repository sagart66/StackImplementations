import java.util.*;
public class TwoStacksUsingArray {
	public static void main(String []args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter size of array");
		int size=input.nextInt();
		int ctr1=-1;
		int ctr2=size;
		int mystack[]=new int[size];
		do {
		System.out.println("Enter your choice \n"
				+ "1. Push in stack1\n"
				+ "2. pop element from stack1\n"
				+ "3. push in stack2\n"
				+ "4. pop an element from stack2\n");
		int choice=input.nextInt();
		switch(choice) {
		case 1:
			if(ctr1+1>=ctr2) {
				System.out.println("Array full");
			}else
				mystack[++ctr1]=input.nextInt();
			break;
		case 2:
			if(ctr1==-1)
				System.out.println("Stack1 is empty");
			else System.out.println(mystack[ctr1--]);
			break;
		case 3:
			if(ctr2-1<=ctr1)
				System.out.println("Array full");
			else
				mystack[--ctr2]=input.nextInt();
			
			break;
		case 4:
			if(ctr2==size)
				System.out.println("Stack2 is empty");
			else
				System.out.println(mystack[ctr2]);	
			break;
		
			
		}
		
		if(ctr1==-1)
			System.out.println("Stack1 is Empty");
		else {
		System.out.print("Elements of stack1 are: ");
		
		
		for(int i=0;i<=ctr1;i++)
			System.out.print(mystack[i]+" ");
		}
		if(ctr2==size) 
		{System.out.println("\nStack2 is empty");}
		else {
		System.out.print("\nElements of stack2 are: ");
		for(int i=size-1;i>=ctr2;i--) 
			System.out.print(mystack[i]+" ");
		}
	}while(true);
	}
	}
