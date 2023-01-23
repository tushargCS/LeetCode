class Solution {
    public int findJudge(int n, int[][] trust) {
        
        if(trust.length==0 && n!=1){return -1;}
        if(trust.length==0){return 1;}
        
        HashSet<Integer>has = new HashSet<>();
        HashMap<Integer,Integer>Map = new HashMap<>();
        
        for(int i=0;i<trust.length;i++){
            has.add(trust[i][0]);
            Map.put(trust[i][0],trust[i][1]);
        }
        
        if(has.size()<n-1){return -1;}
        
        int judge=0;
        for(int i=1;i<=n;i++){
            if(!has.contains(i)){judge=i;break;}
        }
        
        has.clear();
        for(int i=0;i<trust.length;i++){
            if(trust[i][1]==judge){has.add(trust[i][0]);}
        }
        
        if(has.size()==n-1){return judge;}
        
        
        
        return -1;
        
    }
}