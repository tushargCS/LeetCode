class Solution {
    public int deleteGreatestValue(int[][] grid) {
        int ans=0;
        
        int x=0;
        while(x<grid[0].length){
        int finalMax=0;
        for(int i=0;i<grid.length;i++){
            int max=0;
            int temp=0;
            for(int j=0;j<grid[i].length;j++){
                if(max<grid[i][j]){
                    max=grid[i][j];
                    temp=j;
                }
            }
            grid[i][temp]=Integer.MIN_VALUE;
            if(max>finalMax){
                finalMax=max;
            }
        }
            x++;
        ans+=finalMax;
        }
            return ans;
    }
}