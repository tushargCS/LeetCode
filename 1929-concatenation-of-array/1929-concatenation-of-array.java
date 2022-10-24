class Solution {
    public int[] getConcatenation(int[] nums) {
        
        int arr[] = new int[nums.length+nums.length];
        int j=0;
    
        for(int i=0;i<nums.length*2;i++){
            arr[i]=nums[j];
            j=(j+1)%nums.length;
        }
        
        return arr;
    }
}