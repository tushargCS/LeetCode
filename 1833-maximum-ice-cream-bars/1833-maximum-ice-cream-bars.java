class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int i=0;
        int temp=0;
        while(coins>0 && i<costs.length){
            if(coins-costs[i]>=0){
                coins = coins-costs[i];
                i++;
                temp++;
            }
            else{break;}
        }
        
        return temp;
    }
}