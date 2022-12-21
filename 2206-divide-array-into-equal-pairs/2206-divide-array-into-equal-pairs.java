class Solution {
    public boolean divideArray(int[] nums) {
        HashMap<Integer,Integer> Map = new HashMap<>();
        ArrayList<Integer> obj = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(!Map.containsKey(nums[i])){
                Map.put(nums[i],1);
                obj.add(nums[i]);
            }
            else{
                int t = Map.get(nums[i]);
                t++;
                Map.put(nums[i],t);
            }
        }
        
        int t = nums.length/2;
        
        int j=0;
        
        for(int i=0;i<obj.size();i++){
            j+=Map.get(obj.get(i))/2;
        }
        
        if(t==j){
            return true;
        }
        
        return false;
    }
}