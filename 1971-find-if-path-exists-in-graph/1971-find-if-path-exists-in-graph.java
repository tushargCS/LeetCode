class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<n;i++){
                adj.add(new ArrayList<>());
        }
        
        for(int i=0;i<edges.length;i++){
            int s = edges[i][0];
            int d = edges[i][1];
            adj.get(s).add(d);
            adj.get(d).add(s);
        }
        
        boolean [] visited = new boolean[n];
        Arrays.fill(visited,false);
        Queue<Integer> q = new LinkedList<>();
        
        q.add(source);
        visited[source] = true;
        
        while(!q.isEmpty()){
            int node =  q.poll();
            for(int it:adj.get(node)){
                if(visited[it]!=true){
                    visited[it] = true;
                    q.add(it);
                }
            }
            
        }
        
        if(visited[destination] == false){
            return false;
        }
        else{
            return true;
        }
        
    }
}