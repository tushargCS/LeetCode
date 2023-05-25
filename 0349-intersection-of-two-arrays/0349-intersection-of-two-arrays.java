class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
     
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        int i=0;
        int j=0;
        
        int x=0;
        HashSet<Integer> obj = new HashSet<>();
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]==nums2[j]){
                obj.add(nums1[i]);
                i++;
                j++;
            }
            else if(nums1[i]<nums2[j]){
                i++;
            }
            else{
                j++;
            }
        }
        i=0;
        
        int arr[] = new int[obj.size()];
        
        for(int a:obj){
            arr[i++] = a;
        }
        
        return arr;
    }
}