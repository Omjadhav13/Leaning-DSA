package Searching_Examples;

import java.rmi.dgc.VMID;
import java.util.Arrays;
import java.util.Scanner;

public class Binary_Search {

    static int Binary_Search(int a[],int start,int end,int key){
        if(start<=end){
            int mid=(start+end)/2;
            if(key==a[mid])
                return mid;
            else{
                if(key<a[mid])
                    return Binary_Search(a,start,mid-1,key);
                else
                    return Binary_Search(a,mid+1,end,key);
            }
        }
        else
            return -1;
    }
    public static void main(String[] args) {
        int a[]={10,20,30,40,50,60,70,80,90};
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter key");
        int key= sc.nextInt();
        int response= Binary_Search(a,0,a.length-1,key);
        if(response==-1)
            System.out.println(key +" not found");
        else
            System.out.println(key+" found at "+response+" in "+ Arrays.toString(a));

    }
}
