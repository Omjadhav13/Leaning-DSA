package Searching_Examples;

import java.util.Arrays;

public class Quick_Sort {
    static void Quick_Sort(int a[],int start,int end){
        int i,j,pivot,temp;
        i=start;
        pivot=start;
        j=end;

        while(i<j){
            while(a[i]<a[pivot])
                i++;
            while(a[j]>pivot){
                j--;
            }
            if(i<j){
                temp=a[j];
                a[j+1]=a[j];
                a[j]=temp;
            }
        }
        if(i<end)
            Quick_Sort(a,i+1,end);
        if(start<j)
            Quick_Sort(a, start, j-1);
    }
    public static void main(String[] args) {
        int a[]={1,3,5,7,2};
        System.out.println("Start before sorting "+ Arrays.toString(a));
        Quick_Sort(a,0,a.length-1
        );
        System.out.println("Start after sorting "+Arrays.toString(a));

    }
}
