class Solution {
    public int findKthPositive(int[] arr, int k) {
        ArrayList<Integer> obj = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i:arr){
            map.put(i,1);
        }
        for(int i=1;i<=arr[arr.length-1]+k;i++){
            if(map.containsKey(i)){}
            else{
                obj.add(i);
            }
        }
        return obj.get(k-1);
    }
}