class Solution {
    public int myAtoi(String s) {
        s=s.trim();
        int n=1;
        if(s.length()==0){return 0;}
        if(s.charAt(0)=='-'){n=-1;s=s.substring(1,s.length());}
        else if(s.charAt(0)=='+'){s=s.substring(1,s.length());}
        char a[]=s.toCharArray();
        long r=0;
        for(int i=0;i<a.length;i++){
            if((a[i]>=97 && a[i]<=122) || a[i]=='+' || a[i]=='-' || a[i]=='.' || a[i]==' ' ){
                break;
            }
            //System.out.println(r+"  "+n);
            if(r*10>=Integer.MAX_VALUE && n==1){return Integer.MAX_VALUE;}
            if(r*10>=Integer.MAX_VALUE && n==-1){ return Integer.MIN_VALUE;}
            r=r*10;
            r+=a[i]-'0';
        }
          if(r>=Integer.MAX_VALUE && n==1){return Integer.MAX_VALUE;}
            if(r>(Integer.MAX_VALUE) && n==-1){ return Integer.MIN_VALUE;}
        return ((int)r*n);
    }
}