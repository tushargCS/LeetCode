class Solution {
    public int minOperations(int[] nums) {
        int count=0;
        for(int  i=0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1]){}
            else{
                while(nums[i]>=nums[i+1]){
                  nums[i+1] = nums[i+1]+1;
                    count++;
                }
            }
        }
        return count;
    }
}