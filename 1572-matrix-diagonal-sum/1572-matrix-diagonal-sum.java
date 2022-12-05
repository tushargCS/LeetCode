class Solution {
    public int diagonalSum(int[][] mat) {
        
        int l = mat[0].length;
        int sum=0;
        int sum1=0;
        if(l%2!=0){
            for(int i=0;i<mat.length;i++){
                for(int j=i;j<mat[i].length;j++){
                    if(i==j){
                        sum+=mat[i][j];
                        sum1+=mat[j][mat.length-1-j];
                        break;
                    }
                }
            }
            
           System.out.println(sum);
            sum=sum+sum1;
            sum=sum-mat[l/2][l/2];
        }
        else{
          for(int i=0;i<mat.length;i++){
                for(int j=i;j<mat[i].length;j++){
                    if(i==j){
                        sum+=mat[i][j];
                          sum1+=mat[j][mat.length-1-j];
                        break;
                    }
                }
            }
            sum=sum+sum1;
        }
        return sum;
    }
}