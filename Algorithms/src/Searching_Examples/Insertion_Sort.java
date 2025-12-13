package Searching_Examples;

import java.util.Arrays;

public class Insertion_Sort {
    static void Insertion_Sort(int a[]){
        int i,j,newElement;
        for (i=3;i<a.length-1;i++){
            j=i+1;
            newElement=a[j];
            while(j>0 && a[j-1]>newElement){
                a[j]=a[j-1];
                j--;
            }
            a[j]=newElement;
        }
    }
        public static void main(String[] args) {
            int a[]={1,3,5,7,2};
            System.out.println("Start before sorting "+ Arrays.toString(a));
            Insertion_Sort(a);
            System.out.println("Start after sorting "+Arrays.toString(a));

        }
}
