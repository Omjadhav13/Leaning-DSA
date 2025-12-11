package DoublyLinkedList;

import java.util.Scanner;

public class DoublyLInkedlist {
    Dnode root;//single data member

    //insert_left
    void insert_left(int data) {
        Dnode node = new Dnode(data);
        if (root == null) {
            root = node;
        } else {
            node.right = root;
            root.left=node;
            root = node;
        }
    }

    void delete_Left() {
        if (root == null) {
            System.out.println("List empty");
        } else {
            Dnode t = root;
            if (root.right == null) {
                root = null;
            } else {
                root = root.right;
                root.left = null;
                System.out.println("Deleted");
            }
        }
    }

    void insert_right(int data) {
        Dnode node = new Dnode(data);
        if (root == null) {
            root = node;
        } else {
            Dnode t = root;
            while (t.right != null) {
                t = t.right;
            }
            t.right = node;
            node.left=t;
        }
    }

    void delete_Right() {
        if (root == null) {
            System.out.println("list is Empty");
        } else {
            Dnode t ,t2;
                    t= root;
            while (t.right != null) {

                t = t.right;
            }
            if (t == root) {
                root = null;
            } else {
                t2=t.left;
                t2.right = null;
            }
            System.out.println(t.data + "deleted");
        }
    }

    void print_list() {
        if (root == null)
            System.out.println("List is empty");
        else {
            Dnode t = root;
            while (t != null) {
                System.out.print("<-|" + t.data + "|->");
                t = t.right;
            }
            System.out.println();
        }
    }

    void print_list_rev() {
        if (root == null)
            System.out.println("List is empty");
        else {
            Dnode t = root;
            while (t.right != null) {
                t = t.right;
            }
            while(t!=null){
                System.out.print("<-|" + t.data + "|->");
                t=t.left;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int choice=0,num;
        Scanner sc=new Scanner(System.in);
        DoublyLInkedlist list=new DoublyLInkedlist();
        do{
            System.out.println("1. Insert from left into list");
            System.out.println("2. Insert from right into list");
            System.out.println("4. Delete from left");
            System.out.println("5. Delete from right");
            System.out.println("8. Print");
            System.out.println("6. Print rev");

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
                case 6:
                    System.out.println("Enter element to be search  ");

                    list.print_list_rev();
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
