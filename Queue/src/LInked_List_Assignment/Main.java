package LInked_List_Assignment;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TwoStacks ts = new TwoStacks(100);  // default size

        while (sc.hasNext()) {
            String op = sc.next();

            switch (op) {

                case "push1":
                    ts.push1(sc.nextInt());
                    break;

                case "push2":
                    ts.push2(sc.nextInt());
                    break;

                case "pop1":
                    System.out.println(ts.pop1());
                    break;

                case "pop2":
                    System.out.println(ts.pop2());
                    break;

                default:
                    return;
            }
        }
    }
}