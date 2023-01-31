class Solution {
    public void rotate(int[][] matrix) {
        int arr[][] = new int[matrix.length][matrix.length];
        
        int n = matrix.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[j][arr.length-1-i] = matrix[i][j];
            }
        }
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j] = arr[i][j];
            }
        }
        
    }
}