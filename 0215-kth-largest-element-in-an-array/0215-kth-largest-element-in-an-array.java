class Solution {
    public int findKthLargest(int[] nums, int k) {
       Arrays.sort(nums);
        return nums[nums.length-k];
    }
}


 // PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
 //        int i=0;
 //        while(i<nums.length){
 //            pq.add(nums[i++]);
 //        }
 //        while(k-->0){
 //            if(k==0){return pq.peek();}
 //            pq.poll();
 //        }
 //        return -1;