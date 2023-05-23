class KthLargest {
    PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
    int j=0;
    public KthLargest(int k, int[] nums) {
        int i=0;
        j=k;
        while(i<nums.length){
            pq.add(nums[i]);
            if(i>=k){pq.poll();}
            i++;
        }
    }
    
    public int add(int val) {
        pq.add(val);
        while(pq.size()>j){
            pq.poll();
        }
        return pq.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */