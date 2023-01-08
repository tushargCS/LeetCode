class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        
        int t1=0;
        for(int i=0;i<cost.length;i++){
            t1+=gas[i]-cost[i];
        }
        if(t1<0){return -1;}
        
        
        int s=0;
        int total=0;
        for(int i=0;i<cost.length;i++){
            total+=(gas[i]-cost[i]);
            if(total<0){
                total=0;
                s=i+1;
            }
        }
        
        return s;
    }
}