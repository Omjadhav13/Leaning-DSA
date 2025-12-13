package Searching_Examples;

import java.util.Arrays;
import java.util.Scanner;

public class Bubble_Sort {

    static void Bubble_Sort(int a[]){
        for(int i=0;i<a.length-1;i++){
            for(int j=0;j<a.length-1;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
    }
    static void bubble_sort_v1(int a[])
    {
        int i,j,temp;
        int pass=0;
        for(i=a.length-1;i>0;i--)//passes n-1 9,8,7,6,5,4,3,2,1,0(stop)
        {
            for(j=0;j<i;j++)//sort by swap step j as second last so j+1 last
            {
                System.out.print("\npass:"+(pass++));
                if(a[j]>a[j+1])
                {
                    temp=a[j];a[j]=a[j+1];a[j+1]=temp;
                }
            }
        }

    }
    static void bubble_sort_v2(int a[])
    {
        int i,j,temp;
        int pass=0;
        boolean done;
        for(i=a.length-1;i>0;i--)//passes n-1 9,8,7,6,5,4,3,2,1,0(stop)
        {
            done=true;//Means sorting is done.
            for(j=0;j<i;j++)//sort by swap step j as second last so j+1 last
            {
               pass++;
                if(a[j]>a[j+1])
                {
                    temp=a[j];a[j]=a[j+1];a[j+1]=temp;
                    done=false;//Sorting is still not done.
                }
            }
            if(done==true)
                return;
        }

    }

    public static void main(String[] args) {
        int a[]={11,9,22,5,77,33,88,33};
        System.out.println("Start before sorting "+Arrays.toString(a));
        bubble_sort_v2(a);
        System.out.println("Start after sorting "+Arrays.toString(a));


    }
}
