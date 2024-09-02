class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<Character>();
        for(char it:s.toCharArray())
     {
        if(it=='('|| it== '{' || it=='['){
    st.push(it);
       }else{
        if(st.isEmpty()){return false;}
         else{
            char ch=st.pop();
                                if ((it == ')' && ch != '(') ||
                        (it == '}' && ch != '{') ||
                        (it == ']' && ch!= '[')) {
                            return false;

            }
         }
        }
}
return st.isEmpty();
    }
}
