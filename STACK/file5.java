class MyQueue {
         Stack<Integer> st;
        Stack<Integer>  s;
        /*Implementation of quueu using two stacks O[n] complexity */

    public MyQueue() {
        st=new Stack<>();
        s=new Stack<>();
    }
    
    public void push(int x) {
        st.push(x);
       
       
    }
    
    public int pop() {
        
       moveelementtostack();
            return s.pop();
        
    }
    
    public int peek() {
        moveelementtostack();
      return   s.peek();
    }
    
    public boolean empty() {
        return s.isEmpty() && st.isEmpty();
    }
    public void moveelementtostack(){
        if(s.isEmpty()){
            while(!st.isEmpty()){
               s.push(st.pop());
            }
        }
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */