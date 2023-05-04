class Solution {
    public int[] numberOfLines(int[] w, String s) {
        int result[] = new int[2];
     
        int c=0;
        int l=1;
     
        for(int i=0;i<s.length();i++){
            if( c+w[s.charAt(i)-'a']<=100 ){
                c+=w[s.charAt(i)-'a'];
            }
            else if(c+w[s.charAt(i)-'a'] > 100){
                l++;
                c=0;
                i--;
            }
            
        }
        
        result[0]=l;
        result[1]=c;
        return result;
    }
}