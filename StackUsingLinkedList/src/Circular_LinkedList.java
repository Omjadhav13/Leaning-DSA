import java.util.Scanner;

public class Circular_LinkedList {
    Node root,last;
    void insert_left(int data) {
        Node node = new Node(data);
        if (root == null) {
            root =last= node;
            last.next=node;
        } else {
            node.next = root;
            root = node;
            last.next=node;
        }
    }

    void delete_Left() {
        if (root == null) {
            System.out.println("List empty");
        } else {
            Node t = root;
            if(root==last){
                root=last=null;
            }else{
            root = root.next;
            last.next=root;
            System.out.println("Deleted");
            }
        }
    }

    void insert_right(int data) {
        Node node = new Node(data);
        if (root == null) {
            root =last= node;
            last.next=root;

        } else {
            last.next=node;
            last=node;
            last.next=root;
        }
    }

    void delete_Right() {
        if (root == null) {
            System.out.println("list is Empty");
        } else {
            Node t = root;
            Node t2 = root;
            while (t2.next != root) {
                t2 = t;
                t = t.next;
            }
            if (last == root) {
                root =last= null;
            } else {
                last=t2;
                last.next=root;
                t2.next = null;
            }
            System.out.println(t.data + "deleted");
        }
    }
    void print_list() {
        if (root == null)
            System.out.println("List is empty");
        else {
            Node t = root;

            do {
                System.out.print("|" + t.data + "|->");
                t = t.next;
            }while (t != root);
        }
    }
    public static void main(String[] args) {
        int choice=0,num;
        Scanner sc=new Scanner(System.in);
        Circular_LinkedList list=new Circular_LinkedList();
        do{
            System.out.println("1. Insert from left into list");
            System.out.println("2. Insert from right into list");
            System.out.println("4. Delete from left");
            System.out.println("5. Delete from right");
            System.out.println("8. Print");

            choice=sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Enter element to be inserted");
                    num=sc.nextInt();
                    list.insert_left(num);
                    break;
                case 2:
                    System.out.println("Enter element to be inserted ");
                    num=sc.nextInt();
                    list.insert_right(num);
                    break;

                case 4:
                    System.out.println("Enter element to be deleted from left ");
                    list.delete_Left();
                    break;
                case 5:
                    System.out.println("Enter element to be deleted from right ");

                    list.delete_Right();
                    break;


                case 8:
                    System.out.println("Enter element to be search  ");

                    list.print_list();
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;

            }
        }while(choice!=0);
    }
}

