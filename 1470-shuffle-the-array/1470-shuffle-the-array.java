class Solution {
    public int[] shuffle(int[] nums, int n) {
        int arr[] = new int[n*2];
        int j=0;
        for(int i=0;i<n;i++){
            arr[j++] = nums[i];
            arr[j++] = nums[n+i];
        }
        
        return arr;
    }
}