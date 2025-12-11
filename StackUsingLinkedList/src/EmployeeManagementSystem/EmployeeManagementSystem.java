package EmployeeManagementSystem;

public class EmployeeManagementSystem {
    Enode root;

    void addEmployee(int id, String name, double salary){
        Enode node=new Enode(id,name,salary);
        if(root==null){
            root=node;
        }
        else{
            Enode t=root;
            while(t.next!=null){

                t=t.next;
            }
            t.next=node;
        }
    }
    void displayEmployees(){
        if(root==null){
            System.out.println("List is empty");
        }
        else{
            Enode t=root;
            while(t!=null){
                t.print();
                t=t.next;
            }

        }
    }

    void searchEmployee(int id){
        if(root==null){
            System.out.println("List is Empty");
        }
        else{
            Enode t=root;
            boolean flag=false;
            while(t!=null){
                if(t.id==id){
                    flag=true;
                    t.print();
                    break;
                }
                else
                    t=t.next;
            }
            if(!flag)
                System.out.println("Not Found");
        }
    }

    void updateEmployee(int id, String newName, double newSalary){
        if(root==null){
            System.out.println("List is Empty");
        }
        else{
            Enode t=root;
            boolean flag=false;
            while(t!=null) {
                if (t.id == id){
                    flag = true;
                    t.name = newName;
                    t.salary = newSalary;
                    break;
                }
                else
                    t=t.next;
            }
            if(!flag)
                System.out.println("Not Found");
        }
    }

    void deleteEmployee(int id){
        if(root==null){
            System.out.println("List is Empty");
        }
        else{
            Enode t,t2;
            t=t2=root;
            boolean flag=false;
            while(t!=null){
                if (t.id == id) {
                    flag=true;
                    if(t==root){
                        root=root.next;
                    }
                    else if(t.next==null){
                        t2.next=null;
                    }
                    else{
                        t2.next=t.next;
                    }
                    break;
                }
                t2=t;
                t=t.next;
            }
            if(!flag)
                System.out.println("Not Found");
        }
    }




}
