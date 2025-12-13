package Searching_Examples;

import java.util.Arrays;
import java.util.Scanner;

public class Sequential_Search {

    static int Sequential_Search(int a[],int key){
        for (int i = 0; i < a.length; i++) {

            if(a[i]==key)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int a[]={11,9,22,5,77,33,88,33};
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter key");
        int key= sc.nextInt();
        int response=Sequential_Search(a,key);
        if(response==-1)
            System.out.println(key +" not found");
        else
            System.out.println(key+" found at "+response+" in "+ Arrays.toString(a));

    }
}
