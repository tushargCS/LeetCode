class Solution {
    public int[] findErrorNums(int[] nums) {
        
     HashMap<Integer,Integer> Map = new HashMap<>();
        
        int arr[] =  new int[2];
        
        for(int i=0;i<nums.length;i++){
            if(Map.containsKey(nums[i])){int t = Map.get(nums[i]); t++; Map.put(nums[i],t);}
            else{Map.put(nums[i],1);}
        }
        
        System.out.println(Map);
        
        for(int i=1;i<=nums.length;i++){
            if(Map.containsKey(i)){if(Map.get(i)==2){arr[0]=i;}}
            else{arr[1]=i;}
        }
        
        return arr;
    }
}