class Solution {
    public boolean isMonotonic(int[] nums) {
        int flag=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<=nums[i+1]){
                
            }
            else if (i==0){
                 flag=1;
                 break;
            }
            else if (i>0){
                flag=1;
                break;
            }
        }
        
        if(flag==1){
             for(int j=0;j<nums.length-1;j++){
                      if(nums[j]>=nums[j+1]){
                          
                      }
                      else{
                          return false;
                      }
                  }
        }
        return true;
    }
}