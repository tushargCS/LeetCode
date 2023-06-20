class Solution {
    public int lastStoneWeight(int[] s) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
        for(int t:s){
            pq.add(t);
        }
        while(pq.size()>1){
            int t1 = pq.poll();
                int t2 = pq.poll();
            if(t1==t2){}else{pq.add(t1-t2);}
           // System.out.println(t1+" "+t2);
            
        }
        
        if(pq.size()==1){return pq.poll();}
        return 0;
    }
}