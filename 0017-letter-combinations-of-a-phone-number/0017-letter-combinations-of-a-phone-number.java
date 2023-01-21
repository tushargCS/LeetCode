class Solution {
    public List<String> letterCombinations(String digits) {
    
    HashMap<Integer,String> Map = new HashMap<>();
         Map.put(2,"abc");
         Map.put(3,"def");
         Map.put(4,"ghi");
         Map.put(5,"jkl");
         Map.put(6,"mno");
         Map.put(7,"pqrs");
         Map.put(8,"tuv");
         Map.put(9,"wxyz");
        
        List<String>obj = new ArrayList<>();
        
        if(digits.length()==0){return obj;}
        
       String S = Map.get(digits.charAt(0)-'0'); 
        
        
        for(int i=0;i<S.length();i++){
            obj.add(S.substring(i,i+1));
        }
        
        for(int i=1;i<digits.length();i++){
            S = Map.get(digits.charAt(i)-'0');
            List<String>temp = new ArrayList<>();
            for(int j=0;j<obj.size();j++){
                 String t = obj.get(j);
                for(int k=0;k<S.length();k++){
                    temp.add(t+S.charAt(k));
                }
            }
            obj.clear();
            obj.addAll(temp);
        }
        
        return obj;
        
    }
}