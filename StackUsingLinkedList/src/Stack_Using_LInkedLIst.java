import java.util.Scanner;


public class Stack_Using_LInkedLIst {
    Node tos; // Top of stack

    // Push operation
    void push(int data) {
        Node n = new Node(data);
        n.next = tos;
        tos = n;
    }

    // Pop operation
    void pop() {
        if (tos == null)
            System.out.println("\nStack Empty");
        else {
            System.out.println(tos.data + " Popped");
            tos = tos.next;
        }
    }

    // Peek operation
    void peek() {
        if (tos == null)
            System.out.println("\nStack Empty");
        else
            System.out.println(tos.data + " @ Peek");
    }

    // Check if stack is empty
    boolean is_empty() {
        return (tos == null);
    }

    // Print stack
    void print_stack() {
        if (tos == null)
            System.out.println("\nStack Empty");
        else {
            Node t = tos;
            System.out.println("\nStack elements:");
            while (t != null) {
                System.out.println("| " + t.data + " |");
                System.out.println(" ----");
                t = t.next;
            }
        }
    }

    // Main Menu
    public static void main(String[] args) {
        Stack_Using_LInkedLIst obj = new Stack_Using_LInkedLIst();
        Scanner in = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nStack Menu");
            System.out.println("----------");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Print");
            System.out.println("0. Exit");
            System.out.print(": ");
            choice = in.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("\nEnter Data: ");
                    int data = in.nextInt();
                    obj.push(data);
                    System.out.println(data + " pushed");
                    break;
                case 2:
                    obj.pop();
                    break;
                case 3:
                    obj.peek();
                    break;
                case 4:
                    obj.print_stack();
                    break;
                case 0:
                    System.out.println("\nThanks for using the code!");
                    break;
                default:
                    System.out.println("\nWrong Choice given.");
            }
        } while (choice != 0);


    }
}
