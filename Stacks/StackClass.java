import java.util.Scanner;

public class StackClass {

    private int top;
    private int maxSize;
    private int[] stack;
    
    void createStack(int size) {
        maxSize = size;
        top = -1;
        stack = new int[maxSize];
        System.out.println("Stack created with size " + size);
    }

    boolean isFull() {
        return top == maxSize - 1;
    }
    
    boolean isEmpty() {
        return top == -1;
    }
    
    void push(int data) {
        if (isFull()) {
            System.out.println("Stack Overflow! Cannot push " + data);
            return;
        }
        stack[++top] = data;
        System.out.println(data + " pushed into stack");
    }

    int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow! Stack is empty");
            return -1;
        }
        return stack[top--];
    }

    int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Nothing to peek");
            return -1;
        }
        return stack[top];
    }
    
    void printStack() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("Stack elements (Top to Bottom):");
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StackClass stackObj = new StackClass();

        System.out.print("Enter stack size: ");
        int size = sc.nextInt();
        stackObj.createStack(size);

        int choice;
        do {
            System.out.println("\n--- Stack Operations ---");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display Stack");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to push: ");
                    int value = sc.nextInt();
                    stackObj.push(value);
                    break;

                case 2:
                    int popped = stackObj.pop();
                    if (popped != -1)
                        System.out.println("Popped element: " + popped);
                    break;

                case 3:
                    int topElement = stackObj.peek();
                    if (topElement != -1)
                        System.out.println("Top element: " + topElement);
                    break;

                case 4:
                    stackObj.printStack();
                    break;

                case 5:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}
