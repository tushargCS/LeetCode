class Solution {
    public boolean hasAlternatingBits(int n) {
        String s = "";
        while(n!=0){
            s = s+String. valueOf(n&1);
            n = n>>1;
        }
        int x = s.length();
        for(int i=0;i<x-1;i++){
            if(s.charAt(i)==s.charAt(i+1)){return false;}
        }
        return true;
    }
}