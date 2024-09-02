public class file2{
    public static int top=-1;
    public static int[] arr=new int[5];
   
    public static void main(String[] args) {
        /*Implement stack using arrays */
        
        
        int x=3;
        Push(x);
        Pop();
        
        Pop();
       
       
    }
    public static void Push(int x) {
        if (top == arr.length - 1) {
            System.out.println("Stack overflow");
        } else {
            arr[++top] = x;
            System.out.println(arr[top]);
        }
    }
    public static void Pop() {
        if (top == -1) {
            System.out.println("nothing to pop");
        } else {
           top--;
        }
    }
}