class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if(!((str1+str2).equals(str2+str1))){return "";}
        for(int i=0;i<str2.length();i++){
            if(str1.contains(str2.substring(i,str2.length()))){
                boolean b = check(str1,str2,str2.substring(i,str2.length()));
                if(b==true){return (str2.substring(i,str2.length())); }
            }
        }
        return "";
    }
    
    public boolean check(String str1,String str2,String sub){
       boolean x = false;
        boolean y = false;
        String temp = sub;
        while(str1.length()>=temp.length()){
            if(str1.equals(temp)){x=true;break;}
            temp = temp+sub;
        }
        if(x==false){return false;}
        temp = sub; 
        while(str2.length()>=temp.length()){
            if(str2.equals(temp)){y=true;break;}
            temp = temp+sub;
        }
       
        if(x==true && y==true){
            return true;
        }
        else{
            return false;
        }
        
    }
    
}