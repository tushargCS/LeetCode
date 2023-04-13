class Solution {
    public boolean validateStackSequences(int[] pu, int[] po) {
        Stack<Integer> st = new Stack();
        int j=0;
        for(int i=0;i<pu.length;i++){
            st.push(pu[i]);
            while(!st.isEmpty() && st.peek()==po[j]){
                st.pop();
                j++;
            }
        }
        
        if(st.isEmpty()){return true;}
        else{return false;}
    }
}