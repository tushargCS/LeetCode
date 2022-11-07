class Solution {
    public int maximum69Number (int num) {
        String s = Integer.toString(num);
        String n="";
        int i=0;
        for( i=0;i<s.length();i++){
            if(s.charAt(i)=='9'){n+='9';}
            else{n+='9';break;}
        }
        i++;
        while(i<s.length()){
            n+=s.charAt(i);
            i++;
        }
        
       num = Integer.parseInt(n);
        return num;
    }
}