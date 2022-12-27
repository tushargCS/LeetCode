class Solution {
    public int maximumBags(int[] c, int[] r, int ac) {
        
        int sum1=0;
        int sum2=0;
//         for(int i=0;i<c.length;i++){
//             sum1+=r[i];
//             sum2+=c[i];
//         }
//         sum1=sum1-sum2;
//         if(sum1<ac){return c.length;}
        
//         sum1=0;
//         sum2=0;
        
        int arr[]= new int[c.length];
        
        for(int i=0;i<c.length;i++){
            arr[i]=c[i]-r[i];
            System.out.println(arr[i]);
        }
        
        Arrays.sort(arr);
        
        System.out.println();
         for(int i=0;i<c.length;i++){
            System.out.println(arr[i]+"  "+ac);
        }
        
                int j=0;
                while(j<arr.length && (ac-arr[j])>=0){
                     System.out.println(ac);
                       ac=ac-arr[j];
                      arr[j]=0;
                      j++;
                    sum1++;
                }
        
        
        
        return sum1;
    }
}