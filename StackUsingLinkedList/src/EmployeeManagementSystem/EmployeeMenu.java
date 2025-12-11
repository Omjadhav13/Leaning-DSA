package EmployeeManagementSystem;

import java.util.Scanner;

public class EmployeeMenu {
    static void main(String[] args) {
        int choice=0,id;
        double sal;
        String name,gender;
        Scanner sc=new Scanner(System.in);
        EmployeeManagementSystem emp=new EmployeeManagementSystem();
        do{
            System.out.println("Employee Management System");
            System.out.println("1. Add Employee");
            System.out.println("2. Display all");
            System.out.println("3. Search Employee");
            System.out.println("4. update Employee");
            System.out.println("5. Delete Employee");
            System.out.println("0. Exit");
            choice=sc.nextInt();

            switch(choice){
                case 1:
                    System.out.println("Enter Employee id");
                    id=sc.nextInt();
                    System.out.println("Enter Employee name");
                    name=sc.next();
                    System.out.println("Enter employee salary");
                    sal=sc.nextDouble();
                    emp.addEmployee(id,name,sal);
                    break;
                case 2:
                    emp.displayEmployees();
                    break;
                case 3:
                    System.out.println("Enter Employee id ");
                    id=sc.nextInt();
                    emp.searchEmployee(id);
                    break;
                case 4:
                    System.out.println("Enter Employee id");
                    id=sc.nextInt();
                    System.out.println("Enter Employee name");
                    name=sc.next();
                    System.out.println("Enter employee salary");
                    sal=sc.nextDouble();
                    emp.updateEmployee(id,name,sal);
                    break;
                case 5:
                    System.out.println("Enter Employee id");
                    id=sc.nextInt();
                    emp.deleteEmployee(id);
                    break;
                case 0:
                    System.out.println("Thank you! Exiting..");
                    break;
                default:
                    System.out.println("Invalid chioce");
                    break;
            }
        }while(choice!=0);
    }
}
