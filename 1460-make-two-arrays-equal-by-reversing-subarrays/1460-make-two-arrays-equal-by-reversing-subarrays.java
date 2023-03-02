class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int v:target){
            map.put(v,map.getOrDefault(v,0)+1);
        }
          HashMap<Integer,Integer> map1 = new HashMap<>();
        for(int v:arr){
            if(!map.containsKey(v)){return false;}
             map1.put(v,map1.getOrDefault(v,0)+1);
        }
        
        if(map1.size()!=map.size()){
            return false;
        }
        
        for(int v:arr){
            if(map.get(v)!=map1.get(v)){
                return false;
            }
        }
        
        return true;
    }
}