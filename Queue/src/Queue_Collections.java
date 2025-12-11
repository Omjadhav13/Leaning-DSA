import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Queue_Collections {
    public static void main(String[] args) {
        Queue<Integer> obj = new LinkedList<>();
        //Is an interface which gets implemented via linked list class.
        Scanner in = new Scanner(System.in);
        System.out.println("Entetr Binary number ");
        String text = in.next();
        int sum=0;

        for (char bit : text.toCharArray()) {
            int num = bit - '0';
            obj.add(num);
        }
        while (!obj.isEmpty()) {
            sum += obj.remove()*(Math.pow(2,obj.size()));
        }
        System.out.println("Decimal "+sum);
    }

}

