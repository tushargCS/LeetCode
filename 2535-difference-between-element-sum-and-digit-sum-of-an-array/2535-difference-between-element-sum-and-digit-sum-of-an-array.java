class Solution {
    public int differenceOfSum(int[] nums) {
        int sum=0;
        int digit=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            int t = nums[i];
            while(t!=0){
               digit+= t%10;
                t=t/10;
            }
        }
        
        return Math.abs(sum-digit);
    }
}