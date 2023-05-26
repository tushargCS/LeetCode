class Solution {
    public int[] sortByBits(int[] arr) {
       int a[] = new int[arr.length];
        Arrays.sort(arr);
        
        for(int i=0;i<arr.length;i++){
            int x=0;
            int t = arr[i];
            while(t!=0){
                if((t&1)==1){x++;}
                t = t>>1;
            }
            a[i] = x;
        }
        
        int max=0;
        for(int i:a){
            // System.out.println(i);
            if(max<i){max=i;}
        }
        
        int r[] = new int[a.length];
        int k=0;
        for(int i=0;i<=max;i++){
            for(int j=0;j<a.length;j++){
                if(a[j]==i){
                    r[k++] = arr[j];
                }
            }
        }
        
        
        
        return r;
    }
}