class Solution {
    public int[] constructRectangle(int area) {
        
        int l=0;
        int r=0;
        int i=area;
     
        int min=Integer.MAX_VALUE;
            
       
        while(l>=r && i>=1){
            for(int j=1;j<=i&&(i*j<=area);j++){
                 if(min>(i-j) && (i*j)==area){
                l=i;
                r=j;
                min=(i-j);
            }                
            }

             i--;
        }
        
        
        
        return new int[]{l,r};
        
    }
}