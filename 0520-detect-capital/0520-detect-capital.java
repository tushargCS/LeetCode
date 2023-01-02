class Solution {
    public boolean detectCapitalUse(String word) {
       
        
        
        char[] c = word.toCharArray();
        
        
        int i=0;
        for(i=0;i<c.length;i++){
                   if(c[i]>=65 && c[i]<=90){}
                   else{break;}
        }
        if(i==c.length){return true;}
        for(i=0;i<c.length;i++){
                   if(c[i]>=97 && c[i]<=122){}
             else{break;}
        }
        if(i==c.length){return true;}
        i=0;
        for(i=0;i<c.length;i++){
                   if(c[i]>=97 && c[i]<=122 && i>=1){}
                  else if(c[i]>=65 && c[i]<=90 && i==0){}
                   else{return false;}
        }
        if(i==c.length){return true;}
        return false;
    }
}