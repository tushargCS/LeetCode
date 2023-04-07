class Solution {
    public int numEnclaves(int[][] grid) {
        boolean arr[][] = new boolean[grid.length][grid[0].length];
        int x=0;
        for(int i=0;i<2;i++){
            for(int j=0;j<grid[0].length;j++){
                fun2(x,j,grid,arr);
            }
            x = grid.length-1;
        }
        x=0;
        for(int j=0;j<2;j++){
            for(int i=0;i<grid.length;i++){
                fun2(i,x,grid,arr);
            }
            x=grid[0].length-1;
        }
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]==1){
                    fun(i,j,grid,arr,0);
                }
            }
        }
        return max;
    }
    int max=0;
    public void fun(int i, int j, int grid[][], boolean arr[][],int count){
        if(i >= grid.length || j >= grid[0].length || i<0 || j<0){
            return;
        }
        if(arr[i][j]==true){return;}
        else if(grid[i][j]==0){return;}
        else if( i >= grid.length-1 || j >= grid[0].length-1 || j==0 || i==0 ){ 
          fun2(i,j,grid,arr);
            return;
        }
        else {
            
            arr[i][j]=true;
            max++;
            fun(i,j-1,grid,arr,count);
            fun(i,j+1,grid,arr,count);
            fun(i-1,j,grid,arr,count);
            fun(i+1,j,grid,arr,count);
            
        }
    }
    public void fun2(int i, int j, int grid[][], boolean arr[][]){
         if(i >= grid.length || j >= grid[0].length || i<0 || j<0){
            return;
        }
        if(arr[i][j]==true){return;}
        else if(grid[i][j]==0){return;}
       
            arr[i][j]=true;
            fun2(i,j-1,grid,arr);
            fun2(i,j+1,grid,arr);
            fun2(i-1,j,grid,arr);
            fun2(i+1,j,grid,arr);
            return;
        
    }
}