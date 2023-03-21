class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int i=0;
        int j=0;
        if(name.length()>typed.length()){return false;}
        while( i<name.length() && j<typed.length() ){
            if(name.charAt(i)==typed.charAt(j)){
                i++;
                j++;
            }
            else if(name.charAt(i)!=typed.charAt(j)){
                if(i!=0 && name.charAt(i-1)!=typed.charAt(j)){return false;}
                if(i==0){return false;}
                j++;
            }
            
        }
        
        if( i == name.length() && j!=typed.length() ){
            while( j<typed.length() && name.charAt(i-1)==typed.charAt(j) ){
                j++;
            }
        }
        
        if(i==name.length() && j==typed.length()){return true;}
        else{return false;}
    }
}