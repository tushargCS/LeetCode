class Solution {
    public int superPow(int a, int[] b) {
       a = a%1337;
       int x=1140;
       int s=0;
       int c=1; 
       for(int i=0;i<b.length;i++){
           s=((s*10)+b[i])%x;
       } 
    System.out.println(s);
       return fun(a,s,1337);     
    }
    
    public int fun(int a, int b, int m){
       int ans=1;
       while(b!=0){
           if((b&1)==1){
               ans = (ans*a)%m;
           }
           a=(a*a)%m;
           b>>=1;
       }
        return ans;
    }
}