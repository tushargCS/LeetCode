class Solution {
    public int maxRepeating(String s, String w) {
        int length = w.length();
        if(s.equals(w)){return 1;}
        
        int total=0;
        if(s.length()<length){return 0;}
        String t=w;
       
        while(s.contains(w)){
            w+=t;
            total++;
        }
        
        return total;
    }
}