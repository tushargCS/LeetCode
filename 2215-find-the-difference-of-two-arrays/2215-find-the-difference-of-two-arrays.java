class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        List<List<Integer>> adj = new ArrayList<>();
        
        for(int i=0;i<nums2.length;i++){
            set1.add(nums2[i]);
        }
        
        for(int i=0;i<nums1.length;i++){
            set2.add(nums1[i]);
        }
        
       // System.out.println(set1);
        
        List<Integer> temp1 = new ArrayList<>();
        List<Integer> temp2 = new ArrayList<>();
        
        for(int i=0;i<nums1.length;i++){
            if(!set1.contains(nums1[i]) && !temp1.contains(nums1[i])){
                temp1.add(nums1[i]);
            }
        }
        
        adj.add(temp1);
        
        for(int i=0;i<nums1.length;i++){
            set2.add(nums1[i]);
        }
        
        for(int i=0;i<nums2.length;i++){
            if(!set2.contains(nums2[i]) && !temp2.contains(nums2[i]) ){
                temp2.add(nums2[i]);
            }
        }
         adj.add(temp2);
        
        return adj;
        
    }
}