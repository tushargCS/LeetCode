class Solution {
    public char findTheDifference(String s, String t) {
     
        HashMap<Character,Integer> Map = new HashMap<>();
        
        for(int i=0;i<s.length();i++){
            if(Map.containsKey(s.charAt(i))){
                int f=Map.get(s.charAt(i));
                f++;
                Map.put(s.charAt(i),f);
            }
            else{
                Map.put(s.charAt(i),1);
            }
        }
            
            for(int i=0;i<t.length();i++){
                if(Map.containsKey(t.charAt(i))){
                     int f=Map.get(t.charAt(i));
                     f--;
                     Map.put(t.charAt(i),f);
                }
                else{
                    return t.charAt(i);
                }
            }
                   
                   for(int i=0;i<s.length();i++){
                       if(Map.get(s.charAt(i))!=0){return s.charAt(i);}
                   }
        
        return 't';
    }
}