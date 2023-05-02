class Solution {
    public int arraySign(int[] nums) {
        int a=0;
        int b=0;
        for(int t:nums){
            if( t == 0 ){return 0;}
            else if(t<0){a++;}
            else{b++;}
        }
        if( a%2 == 0 ){return 1;}
        else{return -1;}
        
        
    }
}