class Solution {
    public String truncateSentence(String s, int k) {
        String arr[] = s.split(" ");
       s="";
        for(int i=0;i<k;i++){
            s+=arr[i];s+=' ';
        }
        return s.substring(0,s.length()-1);
    }
}