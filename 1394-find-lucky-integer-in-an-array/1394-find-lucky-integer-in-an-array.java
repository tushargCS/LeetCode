class Solution {
    public int findLucky(int[] arr) {
       
       int max=Integer.MIN_VALUE;
        int a[] = new int[501];
        
        for(int t:arr){
            a[t]++;
        }
        
        for(int t:arr){
            if(a[t]==t && max<a[t]){max=a[t];}
        }
        
        if(max!=Integer.MIN_VALUE){return max;}
        return -1;
    }
}