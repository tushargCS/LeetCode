class Solution {
    public String defangIPaddr(String a) {
        String s1 = "";
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)=='.'){
                s1+='[';
                s1+='.';
                s1+=']';
            }
            else{
                s1+=a.charAt(i);
            }
        }
        
        return s1;
    }
}