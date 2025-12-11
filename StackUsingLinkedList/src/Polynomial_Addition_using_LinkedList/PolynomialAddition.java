package Polynomial_Addition_using_LinkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class PolynomialAddition {

        static LinkedList<Pnode> createPolynomial(Scanner in) {
            LinkedList<Pnode> list = new LinkedList<>();

            System.out.print("\nEnter highest power: ");
            int hp = in.nextInt();

            for (int i = hp; i >= 0; i--) {
                System.out.print("Enter coefficient for power " + i + ": ");
                float co = in.nextFloat();
                if (co != 0) {
                    list.add(new Pnode(co, i));
                }
            }
            return list;
        }


        static void displayPolynomial(LinkedList<Pnode> list) {
            for (Pnode item : list) {
                System.out.print(item.co + "X^" + item.power + " + ");
            }
            System.out.println();
        }


        static LinkedList<Pnode> addPolynomial(LinkedList<Pnode> list1, LinkedList<Pnode> list2) {
            LinkedList<Pnode> ans = new LinkedList<>();
            int i1 = 0, i2 = 0;

            while (i1 < list1.size() && i2 < list2.size()) {
                Pnode e1 = list1.get(i1);
                Pnode e2 = list2.get(i2);

                if (e1.power == e2.power) {
                    ans.add(new Pnode(e1.co + e2.co, e1.power));
                    i1++;
                    i2++;
                } else if (e1.power > e2.power) {
                    ans.add(e1);
                    i1++;
                } else {
                    ans.add(e2);
                    i2++;
                }
            }

            while (i1 < list1.size()) {
                ans.add(list1.get(i1++));
            }

            while (i2 < list2.size()) {
                ans.add(list2.get(i2++));
            }

            return ans;
        }


        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);

            System.out.println("\nEnter First Polynomial: ");
            LinkedList<Pnode> list1 = createPolynomial(in);
            displayPolynomial(list1);

            System.out.println("\nEnter Second Polynomial: ");
            LinkedList<Pnode> list2 = createPolynomial(in);
            displayPolynomial(list2);

            LinkedList<Pnode> ans = addPolynomial(list1, list2);

            System.out.print("\nAddition Result: ");
            displayPolynomial(ans);

            in.close();
        }
    }

