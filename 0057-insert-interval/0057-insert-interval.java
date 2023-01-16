class Solution {
    public int[][] insert(int[][] old, int[] newarr) {
        ArrayList<ArrayList<Integer>>obj = new ArrayList<>();
        boolean flag = false;
     
         if(old.length==0){
            int r[][]= new int[1][2];
            r[0][0]=newarr[0];
            r[0][1]=newarr[1];
            return r;
        }
        

        
        
    for(int i=0;i<old.length;i++){
          if(old[i][0]<newarr[0]){
              ArrayList<Integer> o  =new ArrayList<>();
              o.add(old[i][0]);
              o.add(old[i][1]);
              obj.add(o);
          }
          else if(flag==false){
              ArrayList<Integer> g  =new ArrayList<>();
              g.add(newarr[0]);
              g.add(newarr[1]);
              obj.add(g);
               ArrayList<Integer> o  =new ArrayList<>();
              o.add(old[i][0]);
              o.add(old[i][1]);
              obj.add(o);
              flag=true;
          }
          else{
               ArrayList<Integer> o  =new ArrayList<>();
              o.add(old[i][0]);
              o.add(old[i][1]);
              obj.add(o);
          }
      }
        
        if(flag==false){
             ArrayList<Integer> g  =new ArrayList<>();
              g.add(newarr[0]);
              g.add(newarr[1]);
              obj.add(g);
        }
        
          
        
        
        for(int i=0;i<obj.size()-1;i++){
            if(obj.get(i).get(1)>=obj.get(i+1).get(0) && obj.get(i).get(1)<=obj.get(i+1).get(1) ){
                obj.get(i).remove(1);
                obj.get(i).add(obj.get(i+1).get(1));
                obj.remove(i+1);
                i--;
            }
            else if(obj.get(i).get(1)>obj.get(i+1).get(1)){
                obj.remove(i+1);
                i--;
            }
        }
        
        
       int r1[][]= new int[obj.size()][2];
    
        for(int j=0;j<r1.length;j++){
            r1[j][0]= (obj.get(j).get(0));
            r1[j][1]= (obj.get(j).get(1));
        }
        
        return r1;
            
    }
}