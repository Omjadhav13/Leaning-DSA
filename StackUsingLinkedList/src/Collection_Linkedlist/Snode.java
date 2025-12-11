package Collection_Linkedlist;

public class Snode
{
     int rollno;
     String name;
     int  age;
     String gender;
    Snode next;
    Snode(int rollno,String name,int age,String gender){
        this.rollno=rollno;
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.next=null;

    }


    void print_Snode() {
        System.out.println(
                "Rollno=" + rollno +
                ", Name='" + name + '\'' +
                ", Age=" + age +
                ", Gender='" + gender + '\'');
    }
}
