package Stack_Examples;

import java.util.Scanner;

public class Stack_Class {

	int tos,maxSize,stack[];
	
	 void Create_Stack(int size) {
		 tos=-1;
		 maxSize=size;
		 stack=new int [maxSize];
	 }
	 
	 
	 void push(int data) {
		stack[++tos]=data;
	 }
	
	 
	 
	 boolean is_Full() {
		 
//		 if(tos==maxSize-1)
//			 return true;
//		 else
//			 return false;
//		 
		 return (tos==maxSize-1);
	 }
	 
	 
	 int pop() {
//		 int temp=stack[tos];
//		 tos--;
//		 return temp;
//		 
		 return stack[tos--];
	 }
	 
	 boolean isEmpty() {
//		 if(tos==-1)
//			 return true;
//		 else
//			 return false;
		 
		 return (tos==-1);
	 }
	 int peek() {
		 return stack[tos];
	 }
	 void print_stack() {
		 for(int i= tos;i>=0;i--)
		 {
			 System.out.println(stack[i]);
		 }
	 }
	 public static void main(String[] args) {

			int choice, num;
			Stack_Class sc = new Stack_Class();
//			Stack<Integer> sc=new Stack<>();
			System.out.println("Enter the size of the stack");
			Scanner s = new Scanner(System.in);
			int size = s.nextInt();
			sc.Create_Stack(size);
			if (!sc.is_Full()) {
				System.out.println("Enter the number to insert into stack");
				for (int i = 0; i < size; i++) {
					num = s.nextInt();
					sc.push(num);
				}

			} else
				System.out.println("Stck is full");
			do {
				System.out.println("Enter your Choice");
				System.out.println("1. Print last element from stack");
				System.out.println("2. Delete last element from stack");
				System.out.println("3. Print elements from stack");
				System.out.println("4. Exit");
				choice = s.nextInt();
				switch (choice) {

				case 1:
					System.out.println("Peeking");
					System.out.println(sc.peek());
					break;
					
				case 2:
					if (!sc.isEmpty()) {
						System.out.println("Poping");
						System.out.println(sc.pop());
					} else
						System.out.println("Stack is already empty");
						break;
				case 3:
					if (!sc.isEmpty()) {
						sc.print_stack();
						
					} else
						System.out.println("Stack is already empty");
					break;
				case 4:
					System.out.println("Exiting");
					break;
				default:
					System.out.println("Invalid choice");
					break;
				}

			} while (choice != 0);
		}
		
}
