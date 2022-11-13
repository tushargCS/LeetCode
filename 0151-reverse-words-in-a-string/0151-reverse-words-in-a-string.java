class Solution {
    public String reverseWords(String s) {
        String r="";
        String arr[] = new String[s.length()];
        int j=0;
        int temp=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' '){
                temp = find(i,s);
                arr[j]=s.substring(i,temp);
                    j++;
               i=temp;
            }
             
        }
        
        
        for(int i=j-1;i>=0;i--){
            r+=arr[i];
            if(i!=0){r+=" ";}
        }
            
        return r;
    }
    
    public int find(int i,String s){
         if((i)==s.length()){return i;}
        i++;
         if((i)==s.length()){return i;}
        while(s.charAt(i)!=' ' && i<s.length()){
            i++;
            if((i)==s.length()){return i;}
        }
        return i;
    }
}