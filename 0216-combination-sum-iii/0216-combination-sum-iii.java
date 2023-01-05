class Solution {
    List<List<Integer>>obj = new ArrayList<>();
    public List<List<Integer>> combinationSum3(int k, int n) {
     
        
        fun(new ArrayList(),n,k,1);
        return obj;
        
    }
    
    public void fun(List<Integer>li,int n,int k,int j){
        if( n==0 && li.size()==k){
            List<Integer>o = new ArrayList<>(li);
            obj.add(o);
            return;}
        if(li.size()==k){return;}
        for(int i=j;i<=9;i++){
            li.add(i);
            fun(li,n-i,k,i+1);
            int index = li.size()-1;
            li.remove(index);
        }
        
    }
    
}





















// class Solution {
//     List<List<Integer>>obj = new ArrayList<>();
//     public List<List<Integer>> combinationSum3(int k, int n) {
     
        
//         fun(new ArrayList(),n,k,1);
//         return obj;
        
//     }
    
//     public void fun(List<Integer>li,int n,int k,int j){
//         if( n==0 && li.size()==k){
//             List<Integer>o = new ArrayList<>(li);
//             Collections.sort(o);
//             if(!obj.contains(o)){ obj.add(o);}
//             return;}
//         if(li.size()==k){return;}
//         for(int i=j;i<=9;i++){
//             if(!li.contains(i)){li.add(i);}
//             else{continue;}
//             fun(li,n-i,k,j+1);
//             int index = li.size()-1;
//             if(index!=-1) {li.remove(index);}
//         }
        
//     }
    
// }