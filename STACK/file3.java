import java.util.*;
public class file3{
    public static int rear=0;
    public static int front =0;
    public static int count =0;
    public static  int[] arr=new int[5];
public static void main(String[] args) {
    /*works on FIFO basis first come first out */
   
 push(3);
 push(4);
 push(5);
 pop();

}
public static void push(int x){
    int l=rear%5;
    arr[l]=x;
    rear++;
    count++;
    System.out.println(count);
    
    System.out.println(arr[l]);
}
public static void pop(){
    if(count==0){
        System.out.println("nothing to pop");
    }
front++;
count--;


}
}