class Solution {
    public int binaryGap(int n) {
        int t = 0;
        int max=0;
        while(n!=0){
            if((n&1)==1){
            if(max<t){max=t;}
                t = 1;
            }
            else if((n&1)==0){
              if(t!=0){  t++; }
            }
            n = n>>1;
        }
        return max;
    }
}