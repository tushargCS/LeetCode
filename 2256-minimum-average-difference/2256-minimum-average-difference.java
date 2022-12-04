class Solution {
    public int minimumAverageDifference(int[] nums) {
        long arr1[]= new long[nums.length];
        long arr2[] = new long[nums.length];
        long min = Integer.MAX_VALUE;
        long sum1=0;
       
        for(int i=1;i<=nums.length;i++){
            sum1+=nums[i-1];
            arr1[i-1] = (long)(sum1/i);
        }
        
        long sum2=0;
        arr2[nums.length-1]=0;
        int t=1;
        for(int i=nums.length-1;i>=1;i--){
             sum2+=nums[i];
             arr2[t] = (long)(sum2/t);
            t++;
        }
       
        int j=0;
        for(int i=0;i<nums.length;i++){
           arr1[i]=Math.abs(arr1[i]-arr2[arr2.length-1-i]);
            if(min>arr1[i]){
                min=arr1[i];
                j=i;
            }
        }
        
        
       
        return j;
    }
}