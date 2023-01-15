class Solution {
    public String convertToTitle(int c) {
        String s="";
        
        if(c%26==0){
             while(c>0){
               if(c%26==0){ s= 'Z'+s; if(c/26==1){return s;} }
               else{s=(char)('A'+(c%26)-1)+s;} 
               c= c/26-1;
            }
        }
        else{
        while(c>0){
               if(c%26==0){ s= 'Z'+s; if(c/26==1){return s;} }
               else{s=(char)('A'+(c%26)-1)+s;} 
               c= c/26;
        }
        }
        return s;
        
    }
}