class Solution {
    public int maxVowels(String s, int k) {
        int i=0;
        int max=0;
        while(i<k){
            char c = s.charAt(i);
            i++;
            if(c=='a' || c=='A' || c=='e' || c=='E' || c=='i' || c=='I' || c=='o' || c=='O' ||     c=='u' || c=='U'){
                max++;
            }
        }
        
        int t=max;
        
        for(int j=k;j<s.length();j++){
             char c = s.charAt(j-k);
             if(c=='a' || c=='A' || c=='e' || c=='E' || c=='i' || c=='I' || c=='o' || c=='O' ||     c=='u' || c=='U'){
                t--;
             }
             char d = s.charAt(j);
              if(d=='a' || d=='A' || d=='e' || d=='E' || d=='i' || d=='I' || d=='o' || d=='O' ||  d=='u' || d=='U'){
                t++;
              }
            if(max<t){max=t;}
        }
        
        return max;
    }
}