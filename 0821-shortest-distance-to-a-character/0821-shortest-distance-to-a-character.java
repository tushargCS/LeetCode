class Solution {
    public int[] shortestToChar(String s, char c) {
        int arr[] = new int[s.length()];
        ArrayList<Integer>o = new ArrayList<>();
        
        for(int i=0;i<arr.length;i++){
            if(s.charAt(i)==c){
                o.add(i);
            }
        }
        
        int x = s.length();
        for(int i=0;i<x;i++){
            if(s.charAt(i)==c){
                arr[i]=0;
            }
            else{
                int min = Integer.MAX_VALUE;
                for(int t:o){
                    min = min<Math.abs(t-i)?min:Math.abs(t-i);
                    if(t>i){break;}
                }
                arr[i] = min;
            }
        }
        
        return arr;
    }
}