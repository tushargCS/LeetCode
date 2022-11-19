class Solution {
    public String licenseKeyFormatting(String s, int k) {
        if(s.length()==1 && s.charAt(0)=='-'){
            return "";
        }
        if(s.length()==1){
            return s.toUpperCase();
        }
        s = s.replace("-","");
        int left = s.length()%k;
        int set = s.length()/k;
        String news ="";
        int p=k;
        if(left==0){
            for(int i=0;i<set;i++){
                int j=k*i; 
                for( j=k*i;j<p;j++){
                     news+=s.charAt(j);
                 }
                 if(j!=0 && j!=s.length()){
                    news+="-";
                 }
                 p=p+k;
            }
        }
        else{
            for(int i=0;i<left;i++){
                news+=s.charAt(i);
            }
                news+="-";
                p=k;
                for(int i=0;i<set;i++){
                int j=k*i+left; 
                for( j=k*i+left;j<p+left;j++){
                     news+=s.charAt(j);
                }
                if(j!=0 && j!=s.length()){
                     news+="-";
                }
                p=p+k;
                }    
            }
       return news.toUpperCase();
    }
}

