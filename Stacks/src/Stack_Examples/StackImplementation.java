package Stack_Examples;

import java.util.*;

public class StackImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> sc = new Stack<>();

		int choice=0, num;
		Scanner s = new Scanner(System.in);
		
	
		do {
			System.out.println("Enter your Choice");
			
			System.out.println("1. Insert element into stack [PUSH]");
			System.out.println("2. Print last element from stack [Peek]");
			System.out.println("3. Delete last element from stack [POP]");
			System.out.println("4. Print all elements from stack");
			System.out.println("5. Exit");
			choice = s.nextInt();
			switch (choice) {
			case 1:
				
				System.out.print("\nEnter Data:");
                int data=s.nextInt();
                sc.push(data);
                System.out.print("\n"+data+" pushed");
                break;

				case 2:
					System.out.println("Peeking");
					System.out.println(sc.peek());
					break;
	
				case 3:
					if (!sc.empty()) {
						System.out.println("Poping");
						System.out.println(sc.pop());
					} else
						System.out.println("Stack is already empty");
					break;
				case 4:
					if (!sc.empty()) {
						for(int i=sc.size();i>=0;i--) {
							System.out.println(sc.elementAt(i) );
						}
	
					} else
						System.out.println("Stack is already empty");
					break;
				case 5:
					System.out.println("Exiting");
					choice=0;
					break;
				default:
					System.out.println("Invalid choice");
					break;
				}

		} while (choice != 0);
	}
}
