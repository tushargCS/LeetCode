class Solution {
    public int findShortestSubArray(int[] nums) {
        
        HashMap<Integer,Integer>Map1 = new HashMap<>();
        HashMap<Integer,Integer>Map2 = new HashMap<>();
        
        for (int i : nums) {
           Map1.put(i,Map1.getOrDefault(i,0)+1);
        }
        
        int max = -1;
        for(int i:Map1.values()){
            if(max<i){max = i;}
        }
      
        int ans = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(Map1.get(nums[i])==max){
              Map2.put(nums[i],1);
            }
        }
        
        //System.out.println(Map2);
        
        int start = Integer.MAX_VALUE;
         
        for(int i:Map2.keySet()){
            int t1 = start1(nums,i);
            int t2 = end1(nums,i);
             if(t2-t1<=start){
                 start = t2-t1;
             }
             //System.out.println(start+"  "+end);
        }
        return start+1;
    }
    
    public int start1(int arr[],int item){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==item){return i;}
        }
        return 0;
    }
    public int end1(int arr[],int item){
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]==item){return i;}
        }
        return 0;
    }
}