class Solution {
    public int smallestRangeI(int[] nums, int k) {
       if(nums.length==1){return nums[0]-nums[0];}
       Arrays.sort(nums);
        if(nums[0]+k>=nums[nums.length-1]){return 0;}
        
         int min = nums[0];
         int max = nums[nums.length-1];
        
        max = max - k;
        while(k>0 && min<max){
            min++;
            k--;
        }
        
        return max-min;
        
    }
}