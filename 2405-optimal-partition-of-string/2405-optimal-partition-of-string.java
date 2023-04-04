class Solution {
    public int partitionString(String s) {
       StringBuilder sb = new StringBuilder(s);
        int x = sb.length();
        int count=0;
        for(int i=0;i<x;i++){
            StringBuilder temp = new StringBuilder();
            int j=i;
            for(j=i;j<x;j++){
                if( temp.indexOf( Character.toString(sb.charAt(j)) )  != -1 ){   count++; i = --j; break; }
                else{
                    temp.append(sb.charAt(j));
                    if(j==(x-1)){ count++; break; }
                  
                }
            }
            if(j==(x-1)){break;}
            
        }
        
        return count;
    }
}