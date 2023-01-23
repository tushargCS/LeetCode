class Solution {
    public int findJudge(int n, int[][] trust) {
        if(trust.length==0 && n==1){return n;}
        if(trust.length==0){return -1;}
        int max1 = n;        
        System.out.println(max1);
        
        while(max1>=0){
            HashMap<Integer,Integer> Map = new HashMap<>();
            for(int i=0;i<trust.length;i++){
                if(trust[i][1]==max1){Map.put(trust[i][0],max1);}
            }
            if(Map.size()==n-1){break;}
            max1--;
        }
        
        for(int i=0;i<trust.length;i++){
            if(trust[i][0]==max1){return -1;}
        }
        
        return max1;
    }
}