class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int t:arr){
            map.put(t,map.getOrDefault(t,0)+1);
        }
        int c = map.size();
        HashSet<Integer>obj = new HashSet<>();
        for(int t:map.values() ){
            obj.add(t);
        }
        if(obj.size()!=c){return false;}
        return true;
    }
}