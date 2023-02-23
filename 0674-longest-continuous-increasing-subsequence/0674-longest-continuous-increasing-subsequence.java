class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int max=1;
        int t=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]<nums[i]){
                t++;
            }
            else{
                t=1;
            }
            if(max<t){
                max=t;
            }
        }
        return max;
    }
}