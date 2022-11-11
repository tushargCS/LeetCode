class Solution {
    public int[] productExceptSelf(int[] nums) {
       // int arr[]= new int[nums.length];
        int m=1;
        int y=Integer.MIN_VALUE;
        int t=0;
        for(int i=0;i<nums.length;i++){
           if(nums[i]==0){y=i;t++;}
            else{ m*=nums[i]; }
        }
        if(t>1){
            for(int i=0;i<nums.length;i++){
                nums[i]=0;
            }
            return nums;
        }
        else if(y!=Integer.MIN_VALUE){
           for(int i=0;i<nums.length;i++){
               nums[i]=0;
           } 
            nums[y]=m;
        }
        else{
        for(int i=0;i<nums.length;i++){
          if(i!=y){ nums[i]=m/nums[i]; }
        }
        }
        
        return nums;
    }
}