class Solution {
    public int[] sortArray(int[] nums) {
        quicksort(nums,0,nums.length-1);
        return nums;
    }
    
    public void quicksort(int nums[],int p,int q){
        if(p<q){
            int m = (p+q)/2;
            quicksort(nums,p,m);
            quicksort(nums,m+1,q);
            merge(nums,p,m,q);
        }
    }
   
    public void merge(int nums[],int p,int m,int q){
       
        int n1 = m-p+1;
        int n2 = q-m;
        
        int l[] = new int[n1+1];
        int r[] = new int[n2+1];
        
        for(int i = 0;i<n1;i++){
            l[i] = nums[p+i];
        }
        
        for(int i = 0;i<n2;i++){
            r[i] = nums[m+1+i];
        }
        
        l[n1] = Integer.MAX_VALUE;
        r[n2] = Integer.MAX_VALUE;
        
        int x=0;
        int y=0;
        int k = p;
        while(n1!=0 || n2!=0){
            if(l[x]<=r[y]){
                nums[k] = l[x];
                x++;
                n1--;
            }
            else{
                nums[k] = r[y];
                y++;
                n2--;
            }
            k++;
        }
    
    }
    
  
}