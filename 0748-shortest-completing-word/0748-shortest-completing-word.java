class Solution {
    public String shortestCompletingWord(String lP, String[] words) {
        
        lP = lP.toLowerCase();
        HashMap<Character,Integer> map = new HashMap<>();
        
        for(int i=0;i<lP.length();i++){
            char t = lP.charAt(i);
            if( t!=' ' && Character.isAlphabetic(t)){
                  map.put(t,map.getOrDefault(t,0)+1);   
            }
        }
        
     //   System.out.println(map);
        
        int len = Integer.MAX_VALUE;
        int r=0;
        
        for(int i=0;i<words.length;i++){
            HashMap<Character,Integer> temp = new HashMap<>();

            for(int j=0;j<words[i].length();j++){
                char t = words[i].charAt(j);
                temp.put(t,temp.getOrDefault(t,0)+1);   
            }
            
        //    System.out.println(temp);
            
            int flag=0;
            for( char c : map.keySet() ){
                if(!temp.containsKey(c)){
                    flag=1;
                    break;
                }
                else{
                    if(map.get(c)>temp.get(c)){flag=1;break;}
                    else{}
                }
                   // System.out.println(c);
            }
            if( flag == 0 ){
                if(len>words[i].length()){r = i;len = words[i].length();}
            }
        }
        
        return words[r];
        
    }
}