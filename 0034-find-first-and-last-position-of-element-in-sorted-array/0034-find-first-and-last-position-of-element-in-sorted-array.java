class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int i=0;
        int x=0;
       while(i<nums.length){
           if(nums[i]==target){x=i;break;}
           i++;
       }
        i=nums.length-1;
        while(i>=0){
            if(nums[i]==target){
                return new int[]{x,i};
            }
            i--;
        }
        
        return new int[]{-1,-1};
    }
}