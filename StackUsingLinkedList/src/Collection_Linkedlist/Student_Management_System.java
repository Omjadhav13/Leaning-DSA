package Collection_Linkedlist;

import java.util.LinkedList;
import java.util.Scanner;

public class Student_Management_System {
    public static void main(String[] args) {
        LinkedList<Snode> StudentList=new LinkedList<>();

        //adding record

        Snode s=new Snode(1,"abcde",26,"male");
        StudentList.add(s);
        Snode s1=new Snode(2,"appu",16,"male");
        StudentList.add(s1);
        Snode s2=new Snode(3,"appi",27,"female");
        StudentList.add(s2);
        Snode s3=new Snode(4,"appa",50,"male");
        StudentList.add(s3);


        for (Snode n:StudentList){
           n.print_Snode();
        }


        System.out.println("Enter rollno");
        Scanner sc=new Scanner(System.in);
        int roll=sc.nextInt();
        boolean flag=false;
        for (Snode list:StudentList){

            if(roll==list.rollno){
                flag=true;
                list.print_Snode();
            }

        }
        if(flag==false){
            System.out.println("Not found");
        }

    }

}
