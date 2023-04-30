class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer>set = new HashSet<>();
        HashSet<Integer>o = new HashSet<>();
        
        for(int i=0;i<nums1.length;i++){
            set.add(nums1[i]);
        }
        
        for(int i=0;i<nums2.length;i++){
            if(set.contains(nums2[i])){o.add(nums2[i]);set.add(nums2[i]);}
        }
        
        int arr[] = new int[o.size()];
        
        int j=0;
        
        for(int t:o){
            arr[j] = t;
            j++;
        }
        
        return arr;
        
    }
}