class Solution {
    public int[][] insert(int[][] old, int[] newarr) {
        ArrayList<int[]>obj = new ArrayList<>();
        
        int i=0;
        while(i<old.length){
            if(newarr[0]>old[i][0]){
                obj.add(old[i]);
                i++;
            }
            else{
                break;
            }
        }
        
        if(obj.size()==0 || ( obj.get(obj.size()-1)[1] < newarr[0] ) ){
            obj.add(newarr);
        }
        else{
            int last[] = obj.get(obj.size()-1);
            last[1] = Math.max(newarr[1],last[1]);
        }
        
        
        while(i<old.length){
            int last[] =  obj.get(obj.size()-1);
             if(last[1]<old[i][0]){
                 obj.add(old[i]);
             }
            else{
                 last[1] = Math.max(last[1],old[i][1]);   
            }
            i++;
        }
        
        int r [][] = new int[obj.size()][2];
        for(i=0;i<obj.size();i++){
            r[i]=obj.get(i);
        }
        
        return r;
        
    }
}