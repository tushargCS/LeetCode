class Solution {
    public int heightChecker(int[] heights) {
        int arr[] = new int[heights.length];
        for(int i=0;i<heights.length;i++){
            arr[i] = heights[i];
        }
        Arrays.sort(heights);
        int c=0;
        for(int i=0;i<heights.length;i++){
            if(heights[i]!=arr[i]){
                c++;
            }
        }
        return c;
    }
}