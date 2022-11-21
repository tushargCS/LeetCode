class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashSet <Integer>Map = new HashSet<>();
        ArrayList<Integer>obj = new ArrayList<Integer>();
        int x=0; 
        
        for(int i=0;i<nums.length;i++){
            if(!Map.contains(nums[i])){
                Map.add(nums[i]);
            }
            else{
              obj.add(nums[i]);
            }
        }
        
        return obj;
    }
}