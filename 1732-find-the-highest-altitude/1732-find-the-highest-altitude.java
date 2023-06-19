class Solution {
    public int largestAltitude(int[] gain) {
        int sum=0;
        int max=0;
        for(int t:gain){
            if(max<t+sum){max = t+sum;}
            sum = sum+t;
        }
        
        return max;
    }
}