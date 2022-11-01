class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int arr[]= new int[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i]=nums[i];
        }
        Arrays.sort(arr);
        HashMap<Integer,Integer>Map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(Map.containsKey(arr[i])){}
            else{Map.put(arr[i],i);}
        }
        for(int i=0;i<nums.length;i++){
            arr[i]=Map.get(nums[i]);
        }
        
        return arr;
    }
}