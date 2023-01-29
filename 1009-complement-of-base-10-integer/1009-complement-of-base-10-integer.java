class Solution {
    public int bitwiseComplement(int n) {
        
        if(n==0){return 1;}
        
        int ans=0;
        int i=0;
        int t=1;
        
        while(n!=0){
            if((n&1)==0){
            ans += t*1;
            }
            else{
                 ans += t*0;
            }
            t=t*2;
            n>>=1;
        }
        return ans;
    }
}