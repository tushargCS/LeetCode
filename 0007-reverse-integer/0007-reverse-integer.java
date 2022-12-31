class Solution {
    public int reverse(int x) {
        
        if(x>=(Math.pow(2,31))-1){return 0;}
        
        int r1=0;
        if(x<0){
            r1=-1;
        }
        else{
            r1=1;
        }
        
        long r=0;
        x=Math.abs(x);
        
        while(x>0){
                if((r*10)>=((Math.pow(2,31))-1)){return 0;}
                r=r*10;
                r+=x%10;
                x=x/10;
        }
        
          
        
        r=r*r1;
        
        
        
        return (int)r;
        
    }
}