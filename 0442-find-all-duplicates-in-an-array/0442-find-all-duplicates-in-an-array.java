class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap <Integer,Integer>Map = new HashMap<>();
        ArrayList<Integer>obj = new ArrayList<Integer>();
 
        for(int i=0;i<nums.length;i++){
            if(!Map.containsKey(nums[i])){
                Map.put(nums[i],1);
            }
            else{
               obj.add(nums[i]);
            }
        }
        
        return obj;
    }
}