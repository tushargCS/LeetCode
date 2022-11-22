class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
        HashMap<Integer,Integer>Map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            Map.put(nums[i],1);
        }
        ArrayList<Integer>list = new ArrayList<>();
        for(int i=1;i<=nums.length;i++){
            if(!Map.containsKey(i)){list.add(i);}
        }
        
        return list;
        
    }
}