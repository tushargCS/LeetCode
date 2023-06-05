class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        
        HashSet<Integer> h1 = new HashSet<>();
        HashSet<Integer> h2 = new HashSet<>();
        int c[] = new int[A.length];
        
        int x=0;
        for(int i=0;i<A.length;i++){
            x=0;
            h1.add(A[i]);
           
                for(int j=i;j>=0;j--){
                    if(h1.contains(B[j])){
                        x++;
                    }
                }
                
                c[i] = x;
           
        }
        
        return c;
    }
}