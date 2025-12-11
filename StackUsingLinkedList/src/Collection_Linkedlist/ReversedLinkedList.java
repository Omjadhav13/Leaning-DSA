package Collection_Linkedlist;

import java.util.LinkedList;
import java.util.Stack;

public class ReversedLinkedList {

    public static void main() {
        LinkedList<Integer> list=new LinkedList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(5);

        System.out.println("\n List has: "+list);

        Stack<Integer> stack=new Stack<>();

        while(!list.isEmpty())
            stack.push(list.remove());

        while(!stack.isEmpty())
            list.add(stack.pop());

        System.out.println("\n List has: "+list);

    }
}
