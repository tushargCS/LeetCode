class Solution {
    public int pivotIndex(int[] nums) {
        int sum=0;
        for(int v:nums){
            sum+=v;
        }
        
        int left=nums[0];
        sum-=nums[0];
        if(sum==0){return 0;}
        for(int i=1;i<nums.length;i++){
            sum-=nums[i];
            if(left==sum){
                return i;
            }
            left+=nums[i];
        }
        
        return -1;
    }
}