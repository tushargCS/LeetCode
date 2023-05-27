class Solution {
    public int search(int[] nums, int target) {
        int t = fun(nums,target);
        // System.out.println(t);
        if(nums[t]<=target && nums[nums.length-1]>=target){
            return bs(nums,target,t,nums.length-1);
        }
        else if(nums[0]<=target ){
            return bs(nums,target,0,t-1);
        }
            return -1;
    }
    
    public int fun(int nums[], int t){
        int i=0;
        int j=nums.length-1;
        int mid = (i+j)/2;
        while(i<j){
            if(nums[mid]>=nums[0]){i = mid+1;}
            else{ j=mid;}
            mid = (i+j)/2;
        }
        return i;
    }
    
    public int bs(int nums[],int t,int i,int j){
        int mid = (i+j)/2;
        while(i<=j){
            if(nums[mid]==t){return mid;}
            else if(nums[mid]<t){
                i = mid+1;
            }
            else{
                j = mid-1;
            }
            mid = (i+j)/2;
        }
        return -1;
    }
}