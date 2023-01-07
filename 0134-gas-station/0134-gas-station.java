class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        
        
        
        int start=-1;
        int i=0;
        int temp=0;
        int j=0;
        int prev=-1;
        int ps=-1;
        int g=0; 
        
          for(int v=0;v<gas.length;v++){
            g+=gas[v]-cost[v];
        }
        if(g<0){return -1;}
        
        while(prev!=i){
            
            if((gas[i]+temp)>=cost[i]){
                start=i;
                temp = (gas[i]+temp)-cost[i];
                int s = i;
                if(ps==s){return -1;}
                else{ps=s;}
                i++;
                i = i%gas.length;
                while((gas[i]+temp)>=cost[i] && s!=i){
                    temp = (gas[i]+temp)-cost[i];
                    i++;
                    i = i%gas.length;
                }
                // if(prev==i){return -1;}
                // if(prev==-1){prev=i;}
                if(s==i){return s;}
                temp=0;
            }
            i++;
             if(prev==-1 || start==-1){if(i==gas.length)return -1; }
              i = i%gas.length;
        }
        
        
        return -1;
        
    }
}