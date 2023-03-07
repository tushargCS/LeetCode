class Solution {
    public int arrayPairSum(int[] nums) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for(int i : nums){
            queue.add(i);
        }
        int sum=0;
        for(int i=0;i<nums.length;i++){
            if((i&1)==1){
             sum+=queue.peek();   
            }
            queue.poll();
        }
        return sum;
    }
}