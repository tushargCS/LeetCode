class Solution {
    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>>obj = new ArrayList<>();
        char arr[] = s.toCharArray();
        int x = s.length()-1;
        for(int i=0;i<x;i++){
            int start = i;
            int end = i;
            while(i<x && arr[i]==arr[i+1]){
                i++;
                end++;
            }
            end++;
            if((end-start)>=3){
                List<Integer>o = new ArrayList<>();
                o.add(start);
                o.add(end-1);
                obj.add(o);
            }
        }
        return obj;
    }
}