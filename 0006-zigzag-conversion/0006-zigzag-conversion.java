class Solution {
    public String convert(String s, int n) {
        
        if(s.length()<=n){return s;}
         if(n==1){return s;}
        
     String r="";
        for(int i=0;i<n;i++){
            if(i==0){
                int t=i;
                while(t<s.length()){
                   r+=s.charAt(t);
                   t=t+((n-1)*2); 
                    
                }
            }
            else if(i==(n-1)){
                int t=i;
                while(t<s.length()){
                   r+=s.charAt(t);
                   t=t+((n-1)*2); 
                }
            }
            else{
                int x=0;
                int t=i;
                while(t<s.length() || x<s.length()){
                   if(x!=0 && x<s.length()){r+=s.charAt(x);} 
                    if(t<s.length())r+=s.charAt(t);
                    System.out.println(t+"  "+x);
                   x=(t+((n-1)*2)-(2*i));
                   t=t+((n-1)*2);
                }
            }
        }
        
        
        return r;
        
    }
}
