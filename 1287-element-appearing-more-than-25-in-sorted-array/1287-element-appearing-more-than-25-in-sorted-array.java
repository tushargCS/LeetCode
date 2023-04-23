class Solution {
    public int findSpecialInteger(int[] arr) {
        int l = arr.length/4;
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int t:arr){
            map.put(t,map.getOrDefault(t,0)+1);
        }
        System.out.println(map);
        
        for(int t:arr){
            if( map.get(t) > l ){
                return t;
            }
        }
        
        return 0;
    }
}