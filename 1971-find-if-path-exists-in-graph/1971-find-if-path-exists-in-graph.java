class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        ArrayList<Integer> adj[] = new ArrayList[n];
        for(int i=0;i<n;i++){
                adj[i] = new ArrayList<>();
        }
        
        for(int i=0;i<edges.length;i++){
            int s = edges[i][0];
            int d = edges[i][1];
            adj[s].add(d);
            adj[d].add(s);
        }
        
        boolean [] visited = new boolean[n];
        Arrays.fill(visited,false);
        Queue<Integer> q = new LinkedList<>();
        
        q.add(source);
        visited[source] = true;
        
        while(!q.isEmpty()){
            int node =  q.poll();
            for(int it:adj[node]){
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