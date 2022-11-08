class Solution {
    public String makeGood(String s) {
        
        String n=s;
        
        while(1<2){
        s=n;
        ArrayList<Integer> obj = new ArrayList<>();
        for(int i=0;i<s.length()-1;i++){
            if(Character.toLowerCase(s.charAt(i)) == Character.toLowerCase(s.charAt(i+1)) && (check(s.charAt(i+1),s.charAt(i)))){ 
                obj.add(i);
                obj.add(i+1);
                i++;
            }
        }
            
        if(obj.size()==0){return n;}
            n="";
        for(int t=0;t<s.length();t++){
            if(!obj.contains(t))
                n+=s.charAt(t);
        }
        
        }
          
        
    }
    
    public boolean check(char a , char b){
        if(Character.isUpperCase(b) && Character.isUpperCase(a)){return false;}
        if(Character.isUpperCase(b) || Character.isUpperCase(a)){return true;}
        return false;
    }
}