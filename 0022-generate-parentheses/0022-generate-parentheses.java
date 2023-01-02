class Solution {
    List<String>  obj = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
     
        // obj.clear();
        
        bt("",0,0,n);
       return obj; 
    }
    
    public void bt(String ans,int op,int cl,int max){
        if(ans.length()==max*2){obj.add(ans);return;}
        
        if(op<max){bt(ans+"(",op+1,cl,max);}
        if(cl<op){bt(ans+")",op,cl+1,max);}
    }
}