class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        int x = s.length();
        for(int i=0;i<x;i++){
            if(s.charAt(i)=='('){
                stack.push('(');
            }
            else if(s.charAt(i)=='{'){
                stack.push('{');
            }
            else if(s.charAt(i)=='['){
                stack.push('[');
            }
            else if(s.charAt(i)==')'){
                if(stack.isEmpty()){return false;}
                char t = stack.pop();
                if(t!='('){return false;}
            }
            else if(s.charAt(i)=='}'){
                if(stack.isEmpty()){return false;}
                char t = stack.pop();
                if(t!='{'){return false;}
            }
            else{
                if(stack.isEmpty()){return false;}
                char t = stack.pop();
                if(t!='['){return false;}
            }
        }
        if(stack.isEmpty()){
            return true;
        }
        return false;
    }
}