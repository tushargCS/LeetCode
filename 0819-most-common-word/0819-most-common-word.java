class Solution {
    public String mostCommonWord(String p, String[] b) {
        StringBuilder sb = new StringBuilder();
        p = p.toLowerCase();
         
        // System.out.println(p);
      
        HashMap<String,Integer> map1 = new HashMap<>();
         HashMap<String,Integer> map2 = new HashMap<>();
     
        for(String t:b){
            map2.put(t,1);
        }
        
        for(int i=0;i<p.length();i++){
            int t = p.charAt(i);
             // System.out.println(t);
            if( (t>=97) && (t<=122) ){
                sb.append(p.charAt(i));
               }
               else{
                   sb.append(' ');
               }
        }
        
           System.out.println(sb);
        String s[] = sb.toString().split(" ");
        
        
        
        for(String t:s){
            if(!map2.containsKey(t)){
              map1.put(t,map1.getOrDefault(t,0)+1);
            }
        }
        
        int max=0;
        String r = "";
        for(String t:map1.keySet()){
            if(max<map1.get(t) && (!t.equals(""))){
                max = map1.get(t);
                r = t;
            }
        }
           
               
               return r;
               
    }
}