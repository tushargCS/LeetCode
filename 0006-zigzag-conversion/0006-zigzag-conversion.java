class Solution {
    public String convert(String s, int numRows) {
        
        if(s.length()<=numRows){return s;}
        if(numRows==1){return s;}
        StringBuilder sb = new StringBuilder();
        char ch[] = s.toCharArray();
        int p1 = numRows*2 -2;
        int p2 = 0;
        int n = s.length();
        for(int i=0;i<numRows;i++){
            if(i==0){
                for(int j=i;j<n;j+=p1){
                    sb.append(ch[j]);
                }
            }
            else if(i==numRows-1){
                for(int j=i;j<n;j+=p2){
                    sb.append(ch[j]);
                }
            }
            else{
                int y=0;
                int j=i;
                while(j<n){
                    sb.append(ch[j]);
                    if((y&1)==0){
                        j+=p1;
                    }
                    else{
                        j+=p2;
                    }
                    y++;
                }
            }
            
            p1-=2;
            p2+=2;
        }
        
        return sb.toString();
    }
}