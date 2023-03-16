class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        if( bits.length==1 ){return true;}
        for(int i=0;i<bits.length;i++){
            if(bits[i]==1 && bits[i+1]==1){i++;}
            else if(bits[i]==1 && bits[i+1]==0){i++;}
            else{
                if(i==bits.length-1){return true;}
            }
        }
        return false;
    }
}