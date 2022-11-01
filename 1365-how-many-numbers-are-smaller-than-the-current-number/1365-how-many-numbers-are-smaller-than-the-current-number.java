class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int arr[]= new int[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i]=nums[i];
        }
        Arrays.sort(arr);
        int n[]= new int[nums.length];
        for(int i=0;i<arr.length;i++){
            int j=0;
            while(arr[j]!=nums[i]){j++;}
            n[i]=j;
        }
        return n;
    }
}