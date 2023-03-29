class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int ans[]= new int[2];
        int a=0;
        for(int v:aliceSizes){
            a+=v;
        }
        int b=0;
        for(int v:bobSizes){
            b+=v;
        }
       
        for(int o:aliceSizes){
            for(int i:bobSizes){
                if(a-o+i == b-i+o){
                    ans[0] = o;
                    ans[1] = i;
                    return ans;
                }
            }
        }
        
        return ans;
    }
    
}