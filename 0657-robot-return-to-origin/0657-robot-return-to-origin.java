class Solution {
    public boolean judgeCircle(String moves) {
        int i=0;
        int j=0;
        int x=0;
        int y = moves.length();
        while(x<y){
           char c =  moves.charAt(x);
            if('U'==c){
                i++;
            }
            else if('D'==c){
                i--;
            }
            else if('L'==c){
                j++;
            }
            else{
                j--;
            }
            x++;
        }
        
        return i==0&&j==0 ? true:false;
    }
}