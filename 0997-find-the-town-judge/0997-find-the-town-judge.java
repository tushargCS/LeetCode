class Solution {
    public int findJudge(int n, int[][] trust) {

        if(trust.length==0){if(n==1){return 1;}
                           else{return -1;}}
        HashMap<Integer,HashSet<Integer>> map = new HashMap<>();
        
        for(int i=0;i<trust.length;i++){
            if(!map.containsKey(trust[i][1])){
                HashSet<Integer> t = new HashSet<>();
                t.add(trust[i][0]);
                map.put(trust[i][1],t);
            }
            else{
                HashSet<Integer> t = map.get(trust[i][1]);
                t.add(trust[i][0]);
                map.put(trust[i][1],t);
            }
                
        }
        
        HashSet<Integer>set = new HashSet<>();
        
        for(int []t:trust){
            set.add(t[0]);
        }
        
        for(Integer t:map.keySet()){
            if((map.get(t).size()==n-1) && !set.contains(t)){return t;}
        }
        
        return -1;
        
    }
}