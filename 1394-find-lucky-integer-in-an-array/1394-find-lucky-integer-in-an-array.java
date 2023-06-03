class Solution {
    public int findLucky(int[] arr) {
        Arrays.sort(arr);
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int t:arr){
            map.put(t,map.getOrDefault(t,0)+1);
        }
        int i = arr.length-1;
        while(i>=0){
            int a=map.get(arr[i]);
            if(arr[i]==a){return arr[i];}
            else{i=i-a;}
        }
        
        return -1;
    }
}