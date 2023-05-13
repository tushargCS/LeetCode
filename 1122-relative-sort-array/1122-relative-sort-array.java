class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        HashSet<Integer> map = new HashSet<>();
        for(int t:arr2){
            map.add(t);
        }
        int arr[] = new int[arr1.length];
        ArrayList<Integer>obj = new ArrayList<>();
        int j=0;
        for(int t1:arr2){
            for(int t2:arr1){
                if(t2==t1){arr[j++]=t2;}
            }
        }
        
        for(int i=0;i<arr1.length;i++){
            if(!map.contains(arr1[i])){obj.add(arr1[i]);}
        }
        
        Collections.sort(obj);
        for(int i=0;i<obj.size();i++){
            arr[j++]=obj.get(i);
        }
        
        return arr;
    }
}