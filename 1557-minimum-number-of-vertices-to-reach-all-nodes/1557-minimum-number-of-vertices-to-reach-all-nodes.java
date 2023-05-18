class Solution {
   
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
      
         int indegree[] = new int[n];
         ArrayList<ArrayList<Integer>> g = new ArrayList<>();
         
         boolean vis[] = new boolean[n];
       
        for(int i=0;i<n;i++){
            g.add(new ArrayList<Integer>());
           
        }
        for(List<Integer> t:edges){
            g.get(t.get(0)).add(t.get(1));
            indegree[t.get(1)]++;
        }
        
        List<Integer> result = new ArrayList<>();
        
        for(int i=0;i<n;i++){
            if(indegree[i]==0){
                result.add(i);
            }
        }
        return result;
        
    }
}