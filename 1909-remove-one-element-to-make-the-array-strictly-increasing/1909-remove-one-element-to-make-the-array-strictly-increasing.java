class Solution {
    public boolean canBeIncreasing(int[] nums) {
        for(int i=0;i<nums.length-1;i++){
                if(nums[i]>=nums[i+1]){
                   
                    boolean e1 = r(i,nums);
                    boolean e2 = r(i+1,nums);
                   
                    if(e1==true && e2==true){return false;}
                }
        }
        return true;
    }
    public boolean r(int x,int arr[]){
     int nums[]= new int[arr.length-1];
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(i!=x){nums[j]=arr[i];j++;}
        }
        boolean c = check(nums);
        if(c==true){return true;}
        return false;
    }
    
    public boolean check(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>=arr[i+1]){
                return true;
            }
        }
        return false;
    }
}