class Solution {
      List<List<Integer>> obj = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        
        
        fun(nums,new ArrayList(),nums.length,0,nums.length-1 );
        return obj;  
    }
    

    public void fun(int[]nums,List<Integer>op,int ip,int i,int j){
        //System.out.println(ip+" "+op);
        if(ip==0){obj.add(op);return;}
        
        List<Integer> op1 = new ArrayList<>(op);
        List<Integer> op2 = new ArrayList<>(op);
        
        op2.add(nums[i]);
        
        fun(nums,op1,ip-1,i+1,j);
        fun(nums,op2,ip-1,i+1,j);
        return;
    }
    
}