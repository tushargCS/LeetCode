class Solution {
    public double average(int[] salary) {
      
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        double sal=0;
        
        for(int t:salary){
            if(max<t){max=t;}
            if(min>t){min=t;}
        }
        
        int i=0;
        for(int t:salary){
            if(min!=t && max!=t){i++;sal+=t;}
        }
        
     
        
        return sal/i;
    }
}