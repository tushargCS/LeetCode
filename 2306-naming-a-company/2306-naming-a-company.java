class Solution {
    public long distinctNames(String[] ideas) {
        
       HashSet<String>[] names = new HashSet[26];
       for(int i=0;i<26;i++){
           names[i] = new HashSet<>();
       } 
       
        for(String s:ideas){
            names[s.charAt(0)-'a'].add(s.substring(1));
        }
        long ans=0;
        for(int i=0;i<26;i++){
            for(int j=i+1;j<26;j++){
                long common = 0;
                for(String sn:names[i]){
                    if(names[j].contains(sn)){common++;}
                }
                ans += 2*(names[i].size()-common)*(names[j].size()-common);
            }
        }
        return ans;
    }
}