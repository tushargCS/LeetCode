class Solution {
    public String reverseStr(String s, int k) {
        
//         if(s.length()<k){
//             String sr="";
//             for(int i=s.length()-1;i>=0;i--){
//                 sr+=s.charAt(i);
//             }
            
//             return sr;
//         }
        int c=k;
        k=k*2;
        int left = (s.length())%(k);
        String ss="";
        int tern=0;
      
        int j=0;
        for( j=0;j<s.length()-left;j=j+k){
              String temp = s.substring(j,j+(k/2));
                   String sr="";
                   for(int i=temp.length()-1;i>=0;i--){
                           sr+=temp.charAt(i);
                    }
                    ss=ss+sr;
               temp = s.substring(j+(k/2),j+k);
                  ss=ss+temp;
        }
        
       
        if(s.length()%k==0){
            return ss;
        }
        else if(left<c){
            String temp = s.substring(j,s.length());
                   String sr="";
                   for(int i=temp.length()-1;i>=0;i--){
                           sr+=temp.charAt(i);
                    }
                    ss=ss+sr;
            return ss;
        }
        else if(c<=left && left<k){
            String temp = s.substring(j,j+c);
                   String sr="";
                   for(int i=temp.length()-1;i>=0;i--){
                           sr+=temp.charAt(i);
                    }
                    ss=ss+sr;
               temp = s.substring(j+c,s.length());
                  ss=ss+temp;
            return ss;
        }
        
        return ss;
        
    }
}