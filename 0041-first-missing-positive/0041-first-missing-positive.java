class Solution {
    public int firstMissingPositive(int[] nums) {
        if(nums.length==0){return 1;}
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int t:nums){
            if(min>t){
                min = t;
            }
            if(max<t){
                max=t;
            }
        }
        if(min>1){return 1;}
        if(max<=0){return 1;}
        
        
        for(int i=0;i<nums.length;){
            
            if( nums[i]>nums.length || nums[i]<=0){i++;}
            else if(nums[nums[i]-1]==nums[i]){
                i++;
            } 
            else{   
                int t = nums[nums[i]-1];
                nums[nums[i]-1] = nums[i];
                nums[i] = t;
            }
        }
        
        int j=0;
        for(j=0;j<nums.length;j++){
            if(nums[j]!=j+1){return j+1;}
        }
        
        return nums[j-1]+1;
    }
}