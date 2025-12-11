
package LInked_List_Assignment;

import java.util.*;

public class TwoStacks {
    int arr[];
    int size;
    int top1, top2;

    // Constructor
    TwoStacks(int n) {
        size = n;
        arr = new int[n];
        top1 = -1;          // Stack 1 starts from left
        top2 = n;           // Stack 2 starts from right
    }

    // TODO: push1
    void push1(int x) {
        arr[++top1]=x;
    }

    // TODO: push2
    void push2(int x) {
        arr[--top2]=x;
    }

    // TODO: pop1
    int pop1() {
        // your code here
        int temp=arr[top1--];

        return temp;
    }

    // TODO: pop2
    int pop2() {
        // your code here
        int temp=arr[top2++];
        return temp;
    }
}



