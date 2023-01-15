class Solution {
    public int titleToNumber(String c) {
        
        if(c.length()==1){ char t = c.charAt(0); return t-'A'+1;}
        
        int sum=1;
       
           sum = titleToNumber(c.substring(0,c.length()-1));
           sum=(sum*26)+c.charAt(c.length()-1)-'A'+1;
        
        return sum;
    }
}