package Searching_Examples;

import java.util.Arrays;

public class Selection_Sort {
    static void Selection_Sort(int a[]){
        int i,j,min,min_position;

        for(i=0;i< a.length-1;i++){
            min=a[i];
            min_position=i;
            for(j=i+1;j<a.length;j++){
                if(a[j]<min){
                    min=a[j];
                    min_position=j;
                }
            }
            //swap
            a[min_position]=a[i];
            a[i]=min;
        }
    }
    public static void main(String[] args) {
        int a[]={11,9,22,5,77,33,88,33};
        System.out.println("Start before sorting "+ Arrays.toString(a));
        Selection_Sort(a);
        System.out.println("Start after sorting "+Arrays.toString(a));


    }
}
