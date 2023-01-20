class Solution {
    public boolean checkRecord(String s) {
        
        int absent=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='A'){absent++;}
            
        }
        
        
        int late=0;
        for(int i=0;i<s.length()-2;i++){
            if(s.substring(i,i+3).equals("LLL")){late=1;}
            
        }
        if(late==0 && absent<2){
            return true;
        }
        else{
            return false;
        }
    }
}