class Solution {
    public int removeDuplicates(int[] nums) {
     
        HashSet<Integer> obj = new HashSet<>();
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(!obj.contains(nums[i])){  nums[j]=nums[i]; obj.add(nums[i]);j++;}
        }
        
        return obj.size();
        
    }
}