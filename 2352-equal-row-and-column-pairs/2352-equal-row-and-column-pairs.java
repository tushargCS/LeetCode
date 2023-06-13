class Solution {
    public int equalPairs(int[][] g) {
        int c=0;
        for(int i=0;i<g.length;i++){
            for(int j=0;j<g.length;j++){
                int x=0;
                for(int k=0;k<g.length;k++){
                    if(g[i][k]==g[k][j]){
                        x++;
                    }else{break;}
                }
                if(x==g.length){c++;}
            }
        }
        return c;
    }
}