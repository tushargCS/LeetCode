class Solution {
    public long subArrayRanges(int[] nums) {
       // Arrays.sort(nums);
        long sum=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                sum+=fun(nums,i,j);
            }
        }
        return sum;
    }
    int MAX=Integer.MIN_VALUE;
    int MIN = Integer.MAX_VALUE;
    int max_index=-1;
    
    public int fun(int arr[],int i,int j){
        int max=Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        if(i+1!=j && max_index!=i-1){
            if(MAX>arr[j]){}
            else{MAX = arr[j];}
            
            if(MIN<arr[j]){}
            else{MIN = arr[j];}
            
            return MAX-MIN;
        }
        else{
            while(i<=j){
                if(min>arr[i]){min = arr[i];}
                if(max<arr[i]){max_index=i; max = arr[i];}
                i++;
                MAX = max;
                MIN = min;
            }
        }
        return max-min;
    }
}