class Solution {
    
    List<List<Integer>>obj = new ArrayList<>();
    
    public List<List<Integer>> combinationSum(int[] c, int t) {
        
        List<Integer>temp= new ArrayList<>();
        fun(c,temp,0,t);
        return obj;
    }
    
    public void fun(int arr[],List<Integer>temp,int start,int tar){
        if(tar==0){
            List<Integer> o = new ArrayList<>(temp);
            obj.add(o);
            return;
        }
        if(tar<0){return;}

            for(int i=start;i<arr.length;i++){
                temp.add(arr[i]);
                fun(arr,temp,i,tar-arr[i]);
                int index = temp.size() - 1;
                 temp.remove(index);
            }
        
    }
    
}