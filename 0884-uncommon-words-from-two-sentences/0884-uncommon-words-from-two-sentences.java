class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String,Integer> map = new HashMap<>();
        String arr[] = s1.split(" ");
        for(String s:arr){
            if(map.containsKey(s)){
                int t = map.get(s);
                t++;
                map.put(s,t);
            }
            else{
                map.put(s,1);
            }
        }
        String arr1[] = s2.split(" ");
        for(String s:arr1){
             if(map.containsKey(s)){
                int t = map.get(s);
                t++;
                map.put(s,t);
             }
             else{
                map.put(s,1);
             }
        }
        
        ArrayList<String> obj = new ArrayList<>();
       int c=0;
        for(int v:map.values()){
            if(v==1){c++;}
        }
        String a[] = new String[c];
        int k=0;
        for(String s:map.keySet()){
            if(map.get(s)==1){a[k]=s;k++;}
        }
        return a;
    }
}