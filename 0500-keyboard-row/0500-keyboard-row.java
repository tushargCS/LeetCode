class Solution {
          String s1="qwertyuiop";
          String s2 = "asdfghjkl";
          String s3 = "zxcvbnm";
    public String[] findWords(String[] w) {
         int count=0;
        for(int i=0;i<w.length;i++){
           if(check(w[i])==true){
               count++;
               
           }
            else{
                w[i]="";
            }
        }
        
         String s[] = new String[count];
        int j=0;
            for(int i=0;i<w.length;i++){
                if(w[i].equals("")){}
                else{s[j]=w[i];j++;}
            }
          return s;  
        
    }
    
    public boolean check(String s){
       s=s.toLowerCase();
        int j=0; 
        for(j=0;j<s.length();j++){
                if(s1.indexOf(s.charAt(j))!=-1){}
                else if(j==0){break;}
                else{return false;}
            }
        if(j>=s.length()){return true;}
        j=0; 
        for(j=0;j<s.length();j++){
                if(s2.indexOf(s.charAt(j))!=-1){}
                else if(j==0){break;}
                else{return false;}
            }
         if(j>=s.length()){return true;}
        j=0; 
        for(j=0;j<s.length();j++){
                if(s3.indexOf(s.charAt(j))!=-1){}
                else if(j==0){break;}
                else{return false;}
            }
          if(j>=s.length()){return true;}
        else{return false;}
    }
    
}