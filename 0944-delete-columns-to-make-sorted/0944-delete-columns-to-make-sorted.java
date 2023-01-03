class Solution {
    public int minDeletionSize(String[] s) {
           
           
        int r=0;
        for(int i=0;i<s[0].length();i++){
            ArrayList<Character>obj = new ArrayList();
            int j=0;
            while(j<s.length){
                obj.add(s[j].charAt(i));
                j++;
            }
            ArrayList obj1 = new ArrayList(obj);
            Collections.sort(obj);
            if(obj.equals(obj1)){}
            else{r++;}
        }
        
        return r;
        
    }
}