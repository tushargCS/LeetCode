class Solution {
    public boolean validPalindrome(String s) {
        int i = 0;
        int j = s.length()-1;
        int flag=0;
        StringBuilder sb = new StringBuilder(s);
        
        while(i<j){
            if(flag==1 && s.charAt(i)!=s.charAt(j)){
                return false;
            }
            if(s.charAt(i)!=s.charAt(j)){
                
               boolean b = check(sb,i);
                
                if(b==true){
                    return true;
                }
                
               boolean c =  check(sb,j);
               
                if(c==true){
                    return true;
                }
                
                if(b==false && c==false){
                    return false;
                }
            }
            i++;
            j--;    
        }
        return true;
    }
    
    public boolean check(StringBuilder s,int i){
        StringBuilder sb = new StringBuilder(s);
        sb.deleteCharAt(i);
       // System.out.println(sb);
        i=0;
        int j = sb.length()-1;
        while(i<j){
            if(sb.charAt(i)!=sb.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    
}
