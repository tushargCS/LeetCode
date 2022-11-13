class Solution {
    public String reverseWords(String s) {
        String r="";
      ArrayList<String>obj =new ArrayList<>();
        int temp=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' '){
                temp = find(i,s);
                obj.add(s.substring(i,temp));
                i=temp;
            }
        }
        
        
        for(int i=obj.size()-1;i>=0;i--){
            r+=obj.get(i);
            if(i!=0){r+=" ";}
        }
            
        return r;
    }
    
    public int find(int i,String s){
         i++;
         if((i)==s.length()){return i;}
       
        while(s.charAt(i)!=' ' && i<s.length()){
            i++;
            if((i)==s.length()){return i;}
        }
        return i;
    }
}