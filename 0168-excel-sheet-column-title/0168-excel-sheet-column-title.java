class Solution {
    public String convertToTitle(int c) {
        String s="";
        
        
        while(c>0){
               c--;
               s=(char)('A'+(c%26))+s; 
               c= c/26;
        }
        
        return s;
        
    }
}