class Solution {
    public int subtractProductAndSum(int n) {
        int s=0;
        int p=1;
        while(n>0){
            s+=n%10;
            p*=n%10;
            n/=10;
        }
        
        return p-s;
    }
}