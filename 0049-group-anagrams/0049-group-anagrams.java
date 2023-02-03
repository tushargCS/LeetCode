class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        List<List<String>> obj = new ArrayList<>();
        
        HashMap<HashMap<Character,Integer>,ArrayList<String>> Map = new HashMap<>();
        
        for(String s:strs){
            HashMap<Character,Integer> fre = new HashMap<>();
            int x = s.length();
            for(int i=0;i<x;i++){
                fre.put(s.charAt(i),fre.getOrDefault(s.charAt(i),0)+1);
            }
            if(Map.containsKey(fre)){
                ArrayList<String> temp = Map.get(fre);
                temp.add(s);
                Map.put(fre,temp);
            }
            else{
                ArrayList<String> temp = new ArrayList<>();
                temp.add(s);
                Map.put(fre,temp);
            }
        }
        
        for(ArrayList<String> temp: Map.values()){
            obj.add(temp);
        }
        
        return obj;
    }
}