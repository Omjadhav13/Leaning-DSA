package LInked_List_Examples;

import java.util.Scanner;

public class Linked_List_Linear {
    Node root;//single data member

    //insert_left
    void insert_left(int data) {
        Node node = new Node(data);
        if (root == null) {
            root = node;
        } else {
            node.next = root;
            root = node;
        }
    }

    void delete_Left() {
        if (root == null) {
            System.out.println("List empty");
        } else {
            Node t = root;
            root = root.next;
            System.out.println("Deleted");
        }
    }

    void insert_right(int data) {
        Node node = new Node(data);
        if (root == null) {
            root = node;
        } else {
            Node t = root;
            while (t.next != null) {
                t = t.next;
            }
            t.next = node;
        }
    }

    void delete_Right() {
        if (root == null) {
            System.out.println("list is Empty");
        } else {
            Node t = root;
            Node t2 = root;
            while (t2.next != null) {
                t2 = t;
                t = t.next;
            }
            if (t == root) {
                root = null;
            } else {
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
            while (t.next != null) {
                System.out.print("|" + t.data + "|->");
                t = t.next;
            }
        }
    }

    boolean search(int data) {
        if (root == null) {
            System.out.println("list is empty");
        } else {
            Node t = root;
            while (t.next != null) {
                if (t.data == data) {
                   return true;
                }

                t = t.next;
            }
        }
        return false;
    }

    void insert_After(int ref,int new_element){
        if(root==null){
            System.out.println("List is empty");
        }
        else{
            Node t;
            t=root;
            while(t.data==ref){
                System.out.println("found");
                Node n =new Node(new_element);
                n.next=t.next;
                t.next=n;

            }
        }

    }

    void delete_element(int element){
        if(root==null){
            System.out.println("list empty");
        }
        else{
            Node t,t2;
            t=t2=root;
            while(t!=null){

                if(t.data==element){
                    System.out.println("found");
                } else if (t.next==null) {
                    t2.next=null;
                }
                else{
                    t2.next=t.next;
                    System.out.println("Deleted");
                    return;
                }

                t2=t;
                t=t.next;
            }
            if(t==null){
                System.out.println("not found");
            }
        }
    }

    public static void main(String[] args) {
        int choice=0,num;
        Scanner sc=new Scanner(System.in);
        Linked_List_Linear list=new Linked_List_Linear();
        do{
            System.out.println("1. Insert from left into list");
            System.out.println("2. Insert from right into list");
            System.out.println("3. Insert into after");
            System.out.println("4. Delete from left");
            System.out.println("5. Delete from right");
            System.out.println("6. Delete element");
            System.out.println("7. Search");
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
                case 3:
                    System.out.println("Enter element to be inserted after a number ");
                    num=sc.nextInt();
                    list.insert_After(20,num);
                    break;
                case 4:
                    System.out.println("Enter element to be deleted from left ");
                    list.delete_Left();
                    break;
                case 5:
                    System.out.println("Enter element to be deleted from right ");

                    list.delete_Right();
                    break;
                case 6:
                    System.out.println("Enter element to be deleted  ");

                    list.delete_element(sc.nextInt());
                    break;
                case 7:
                    System.out.println("Enter element to be search  ");

                    System.out.println(list.search(sc.nextInt()));
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
