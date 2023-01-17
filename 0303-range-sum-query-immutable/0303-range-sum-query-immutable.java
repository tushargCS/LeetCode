class NumArray {
          int arr[];
          int arr1[];
    public NumArray(int[] nums) {
          arr= nums;
          arr1=new int[nums.length];
        
        
        if(nums.length>0){  arr1[0]=nums[0];
        for(int i=1;i<nums.length;i++){
             arr1[i]=arr1[i-1]+nums[i];
        }
         }
    }
    
    public int sumRange(int left, int right) {
        if(left==0){return arr1[right];}
        return arr1[right]-arr1[left-1];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */