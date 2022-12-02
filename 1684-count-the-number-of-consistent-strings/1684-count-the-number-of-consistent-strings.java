class Solution {
    public int countConsistentStrings(String a, String[] w) {
        int r=0;
        for(int i=0;i<w.length;i++){
            int t=0;
            for(int j=0;j<w[i].length();j++){
                String s="";
                s+=w[i].charAt(j);
                if(!a.contains(s)){
                    t=1;
                    break;
                }
            }
            if(t==0){
                r++;
            }
        }
        return r;
    }
}