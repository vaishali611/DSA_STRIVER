import java.util.*;
public class file1{
    public static void main(String[] args){
        Stack<Integer> s =new Stack<>();
        s.push(3);
        s.push(10);
        /* System.out.println(s.peek()); */
        s.pop();
        System.out.println(s.peek());
        int pos1=s.search(3);
        System.out.println("pos of 3 : "+pos1);
        s.removeLast();
        s.push(10);
        System.out.println(s.peek()); 

    }
}