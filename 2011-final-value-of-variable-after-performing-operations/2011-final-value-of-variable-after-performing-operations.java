class Solution {
    public int finalValueAfterOperations(String[] o) {
        int v=0;
        for(int i=0;i<o.length;i++){
            if(o[i].charAt(0)=='+' || o[i].charAt(2)=='+'){
                v++;
            }
            else{
                v--;
            }
        }
        
        return v;
    }
}