class Solution {
    public boolean wordPattern(String p, String s1) {
        
        HashMap<Character,String>Map = new HashMap<>();
        HashMap<String,Character>Map1 = new HashMap<>();
        
        String s[] = s1.split(" ");
        char c[] = p.toCharArray();
        
        if(c.length!=s.length){return false;}
        
        for(int i=0;i<s.length-1;i++){
            if(s[i].equals(s[i+1])){
                if(c[i]==c[i+1]){}
                else{return false;}
            }
            else if(!s[i].equals(s[i+1])){
                 if(c[i]!=c[i+1]){}
                else{return false;}
            }
        }
        
        for(int i=0;i<s.length;i++){
            System.out.println(i);
           if(Map.containsKey(c[i])){String temp = Map.get(c[i]); if(!temp.equals(s[i])){return false;} }
            else{Map.put(c[i],s[i]);}
        }
        
         for(int i=0;i<s.length;i++){
            System.out.println(i);
           if(Map1.containsKey(s[i])){char temp = Map1.get(s[i]); if(temp!=(c[i])){return false;} }
            else{Map1.put(s[i],c[i]);}
        }
        
        return true;
    }
}