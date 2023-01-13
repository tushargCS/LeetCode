class Solution {
    public int findLUSlength(String a, String b) {
        if(a.length()>b.length()){return a.length();}
        if(b.length()>a.length()){return b.length();}
        int x=0;
        int start=-1;
        int end=0;
        for(int i=0;i<a.length();i++){
            if(b.charAt(i)!=a.charAt(i)){start=i;break;}
        }
        if(start!=-1){
            return a.length();
        }
        if(start==-1 && end==0){return -1;}
        return a.length();
    }
}