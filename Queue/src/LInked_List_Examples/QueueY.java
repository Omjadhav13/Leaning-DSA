package LInked_List_Examples;

public class QueueY {
    static int arr[];
    static int rear=-1;
    static int size;
    static int front=-1;
    QueueY(int size){
        arr=new int[size];
        this.size=size;
    }
    static boolean isEmpty(){
        return front>rear;
    }

    static void add(int data){
        arr[++rear]=data;
    }
    static int remove(){
        if(!QueueY.isEmpty()){
            return arr[++front];
        }
        else{
            System.out.println("Queue is empty");
        }
        return -1;
    }
    static void print(){
        if(!QueueY.isEmpty()){
            for(int i=0;i<size-1;i++){
                System.out.println(arr[i]);
            }
        }
        else{
            System.out.println("Queue is empty");
        }
    }
}
