class Solution {
    public String reverseStr(String s, int k) {
        
     char arr[] = s.toCharArray();
        
        for(int i=0;i<s.length();i=i+2*k){
            int start=i;
            int end=Math.min(i+k-1,s.length()-1);
            while(start<end){
                char c = arr[start];
                arr[start]=arr[end];
                arr[end]=c;
                start++;
                end--;
            }
        }
        return String.valueOf(arr);
    }
}