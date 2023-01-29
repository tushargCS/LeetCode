class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        
        HashMap<Integer,Integer> Map = new HashMap<>();
        
        for(int i=0;i<arr.length;i++){
            Map.put(arr[i],Map.getOrDefault(arr[i],0)+1);
        }
        HashSet<Integer> s = new HashSet<>();
        for(int a:Map.values()){
            s.add(a);
        }
        
        if(s.size()==Map.size()){return true;}
        return false;
        
    }
}