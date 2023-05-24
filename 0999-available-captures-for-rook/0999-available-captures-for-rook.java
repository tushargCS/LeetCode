class Solution {
    public int numRookCaptures(char[][] b) {
     
        int x=0;
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                if(b[i][j]=='R'){
                    int p = i;
                    int q = j;
                    while(i>=0){
                        if(b[i][j]=='B'){break;}
                        else if(b[i][j]=='p'){x++;break;}
                        i--;
                    }
                    i=p;
                    while(i<8){
                        if(b[i][j]=='B'){break;}
                        else if(b[i][j]=='p'){x++;break;}
                        i++;
                    }
                    i=p;
                    while(j>=0){
                        if(b[i][j]=='B'){break;}
                        else if(b[i][j]=='p'){x++;break;}
                        j--;
                    }
                    j=q;
                    while(j<8){
                        if(b[i][j]=='B'){break;}
                        else if(b[i][j]=='p'){x++;break;}
                        j++;
                    }
                    break;
                }
            }
        }
        return x;
    }
}