class Solution {
    public int dominantIndex(int[] nums) {
        int l=0;
        for(int i=0;i<nums.length;i++){
            if(nums[l]<nums[i]){
                l=i;
            }
        }
       
        for(int i=0;i<nums.length;i++){
            if(i!=l && nums[l]<(nums[i]+nums[i])){return -1;}
        }
        return l;
    }
}