class Solution {
    public int findLucky(int[] arr) {
        Arrays.sort(arr);
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int t:arr){
            map.put(t,map.getOrDefault(t,0)+1);
        }
        
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]==map.get(arr[i])){return arr[i];}
        }
        
        return -1;
    }
}