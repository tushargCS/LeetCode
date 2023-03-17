class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int arr[][] = new int[image.length][image[0].length];
       if(sr>=image.length && sc>=image[sr].length){return image;}
        fun(image,sr,sc,color,image[sr][sc],arr);
        return image;
    }
    public int[][] fun(int[][] image, int sr, int sc, int color,int fix,int arr[][]){
        if(sr<0 || sc<0 || sr>=image.length || sc>=image[sr].length || arr[sr][sc]==1 ){return image;}
        if(image[sr][sc]!=fix){return image;}
        image[sr][sc] = color;
        arr[sr][sc]=1;
        fun(image,sr-1,sc,color,fix,arr);
        fun(image,sr,sc-1,color,fix,arr);
        fun(image,sr+1,sc,color,fix,arr);
        fun(image,sr,sc+1,color,fix,arr);
        return image;
    }
}