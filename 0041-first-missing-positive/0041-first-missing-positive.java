class Solution {
    public int firstMissingPositive(int[] nums) {
        int max=Integer.MIN_VALUE;
        HashMap<Integer,Integer> Map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            Map.put(nums[i],Map.getOrDefault(nums[i],0)+1);
            if(max<nums[i]){max=nums[i];}
        }
        int i=1;
        if(max<=0){return 1;}
        while(i<max){
            if(!Map.containsKey(i)){return i;}
            i++;
        }
        return max+1;
    }
}