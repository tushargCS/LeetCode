public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
       int i=0;
        for(int j=0;j<32;j++){
            if((n&1)==1){
                 i++;
            }
            n= (n>>1);
        }
        return i;
    }
}