class Solution {
    public int[] sortArray(int[] nums) {
        merge_sort(nums,0,nums.length-1);
        return nums;
    }
    
    public void merge_sort(int a[],int l,int r){
        if(l<r){
            int mid = (l)+(r-l)/2;
            merge_sort(a,l,mid);
            merge_sort(a,mid+1,r);
            merge(a,l,mid,r);
        }
    }
    
    public void merge(int a[],int l,int mid,int r){
        int n1 = mid-l+1;
        int n2 = r-mid;
        int left[] = new int[n1];
        int right[] = new int[n2];
        for(int i=0;i<n1;i++){
            left[i] = a[l+i];
        }
        for(int i=0;i<n2;i++){
            right[i] = a[mid+1+i];
        }
        int k = l;
        int x=0;
        int y=0;
        while(x<n1 && y<n2){
            if(left[x]<=right[y]){
                a[k++] = left[x++];
            }
            else{
                a[k++] = right[y++];
            }
        }
        while(x<n1){
             a[k++] = left[x++];
        }
        while(y<n2){
             a[k++] = right[y++];
        }
        
     
    }
    
}