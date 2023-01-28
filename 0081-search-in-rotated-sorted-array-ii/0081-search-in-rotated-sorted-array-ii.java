class Solution {
    public boolean search(int[] nums, int target) {
        int i=0;
        while(i<nums.length){
            if(target==nums[i]){
                return true;
            }
            i++;
        }
        
        return false;
    }
}