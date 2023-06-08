class Solution {
    int x=0;
    public int countNegatives(int[][] grid) {
        for(int i=0;i<grid.length;i++){
            for(int j = grid[i].length-1;j>=0;j--){
                if(grid[i][j]>=0){break;}
                else{x++;}
            }
        }
        return x;
    }
}