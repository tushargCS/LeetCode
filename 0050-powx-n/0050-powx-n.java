class Solution {
    public double myPow(double x, int n) {
        int flag=0;
        if(n<0){flag=1;}
        double r =  fun(x,n);
        if(flag==0){return r;}
        else{return 1/r;}
    }
    
    public double fun(double a ,int b){
        if(b==0){return 1.0;}
        double f = fun(a,b/2);
        if((b&1)==1){
            return a*f*f;
        }
        else{
            return f*f;
        }
    }
}