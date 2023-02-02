class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        HashMap<Character,Integer> Map = new HashMap<>();
        for(int i=0;i<order.length();i++){
            Map.put(order.charAt(i),i);
        }
        
        for(int i=0;i<words.length-1;i++){
            char a[]=words[i].toCharArray();
            for(int j = i+1;j<words.length;j++){
                char b[] = words[j].toCharArray();
                int min = Math.min(a.length,b.length);
                for(int k=0;k<min;k++){
                    if(Map.get(a[k])>Map.get(b[k])){
                        return false;
                    }
                    else if(Map.get(a[k])==Map.get(b[k])){if(k==min-1){if(a.length>b.length){return false;}}}
                    else{break;}
                }
            }
        }
        
        return true;
    }
}