class Solution {
    public String restoreString(String s, int[] in) {
     String news="";
        for(int i=0;i<in.length;i++){
               news+= s.charAt(find(in,i));
        }
        
        return news;
    }
    
    public int find(int arr[],int i){
        int j=0;
        for(j=0;j<arr.length;j++){
            if(arr[j]==i){
                return j;
            }
        }
        return -1;
    }
}