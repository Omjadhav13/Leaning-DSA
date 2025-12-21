
import java.util.Scanner;
public class Queue {

	int front,rear,maxSize,queue[],counter=0;
	
	 void Create_Queue(int size) {
		 front=0;
		 rear=-1;
		 maxSize=size;
		 queue=new int [maxSize];
	 }
	 
	 
	 void enqueue(int data) {
		 rear=(rear+1)%maxSize;
		 counter++;
		 queue[rear]=data;
		
	 }
	
	 
	 
	 boolean is_Full() {
		 
		 return (counter==maxSize);
	 }
	 
	 
	 int dequeue() {
		 int temp=queue[front];
		 front=(front+1)%maxSize;
		 counter--;
		 return temp	;
		
	 }
	 
	 boolean isEmpty() {
	 
		 return (counter==0);
	 }

	 void print_queue() {
		 int i=front;
		 for(int c= 0;c<counter;c++)
		 {
			 
			 System.out.print(queue[i]+" ");
			 i=(i+1)%maxSize;
		 }
		 
	 }
	 
	 
	 public static void main(String[] args) {

			int choice, num;
			Queue sc = new Queue();
			Scanner s = new Scanner(System.in);
			System.out.println("Enter the size of the stack");
			
			int size = s.nextInt();
			sc.Create_Queue(size);
			do {
				
				System.out.println("Enter your Choice");
				System.out.println("1. Enqueu");
				System.out.println("2. Dequeue");
				System.out.println("3. Print ");
				System.out.println("4. Exit");
				choice = s.nextInt();
				switch (choice) {
				case 1:
					
					if (!sc.is_Full()) {
						System.out.println("Enter the number to insert into stack");
						
							num = s.nextInt();
							sc.enqueue(num);
						

					} else
						System.out.println("Queue is full");
				break;
					
				case 2:
					if (!sc.isEmpty()) {
						System.out.println("Dequeue");
						System.out.println(sc.dequeue());
					} else
						System.out.println("Queue is already empty");
						break;
						
				case 3:
					if (!sc.isEmpty()) {
						sc.print_queue();
						
					} else
						System.out.println("Queue is already empty");
					break;
					
				case 4:
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
