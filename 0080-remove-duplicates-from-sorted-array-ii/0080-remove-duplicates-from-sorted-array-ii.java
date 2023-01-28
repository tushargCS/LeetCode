class Solution {
    public int removeDuplicates(int[] nums) {
        
        HashMap<Integer,Integer>Map = new HashMap<>();
        ArrayList<Integer>obj = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(Map.containsKey(nums[i])){
                int t = Map.get(nums[i]);
                t++;
                Map.put(nums[i],t);
            }
            else{
                 obj.add(nums[i]);
                 Map.put(nums[i],1);
            }
        }
        int r=0;
        int j=0;
        int arr[] = new int[nums.length];
        for(int i=0;i<obj.size();i++){
            if(Map.get(obj.get(i))>=2){
                arr[j]=obj.get(i);
                arr[j+1]=obj.get(i);
                j++;
                r+=2;
            }
            else{
                arr[j]=obj.get(i);
                r+=1;
            }
            j++;
        }
        
        for(int i=0;i<arr.length;i++){
            nums[i]=arr[i];
        }
        return r;
        
    }
}