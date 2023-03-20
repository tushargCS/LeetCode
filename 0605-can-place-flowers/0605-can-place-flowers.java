class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(n==0){return true;}
        else if(n>flowerbed.length){return false;}
        else if(flowerbed.length==1){
            if(flowerbed[0]==0 && n==1){return true;}
        }
        
        for(int i=0;i<flowerbed.length-1;i++){
            if(flowerbed[i]==0 && flowerbed[i+1]==1){
                i+=2;
            }
            else if(flowerbed[i]==0 && flowerbed[i+1]==0){
               flowerbed[i]=1;
                n--;
                i+=1;
            }
            else if(flowerbed[i]==1){
                i+=1;
            }
        }
        
        if(flowerbed[flowerbed.length-1]==0  && flowerbed[flowerbed.length-2]==0){n--;}
        
        if(n<=0){return true;}
        else{return false;}
    }
}