class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character>st = new Stack<>();
        Stack<Character>st2 = new Stack<>();
        StringBuilder sb = new StringBuilder();
     
        for(int i=0;i<s.length();i++){
            if(st.size()==1 && st.peek()=='(' && st2.size()==0 && s.charAt(i)==')'){ 
                st.pop();
            }
            else if(st.size()==0 && s.charAt(i)=='('){
                st.add('(');
            }
            else if(s.charAt(i)=='('){
                st2.add('(');
                sb.append(s.charAt(i));
            }
            else{
                st2.pop();
                sb.append(')');
            }
            
        }
        
        return sb.toString();
    }
}