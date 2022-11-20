class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    
        int arr[]= new int[nums1.length+nums2.length];
        int i=0;
        int j=0;
        int x=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<nums2[j]){
                arr[x]=nums1[i];
                x++;i++;
            }
            else{
                arr[x]=nums2[j];
                x++;j++;
            }
        }
        if(i==nums1.length){
            while(j<nums2.length){
                arr[x]=nums2[j];
                x++;j++;
            }
        }
        else{
             while(i<nums1.length){
                arr[x]=nums1[i];
                x++;i++;
            }
        }
        
        if(arr.length%2==0){
              int a=arr.length/2;
              int b = (arr.length/2)-1;
              return (float)(arr[a]+arr[b])/2;
        }
        else{
            return arr[arr.length/2];
        }
        
    }
}