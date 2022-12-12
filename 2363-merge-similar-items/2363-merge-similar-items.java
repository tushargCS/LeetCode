class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] item1, int[][] item2) {
        
        HashMap<Integer,Integer>Map1 =  new HashMap<>();
        HashMap<Integer,Integer>Map2 =  new HashMap<>();
        
        int max1=0;
        for(int i=0;i<item1.length;i++){
            if(item1[i][0]>max1){max1=item1[i][0];}
            Map1.put(item1[i][0],item1[i][1]);
        }
        int max2=0;
         for(int i=0;i<item2.length;i++){
             if(item2[i][0]>max2){max2=item2[i][0];}
             Map2.put(item2[i][0],item2[i][1]);
        }
        
          List<List<Integer>>Ret = new ArrayList<>();
        
        int i=0;
        while(i<=max1 || i<=max2){
           if(Map1.containsKey(i) || Map2.containsKey(i)){
            ArrayList<Integer>obj = new ArrayList<>();
            obj.add(i);
               int temp2=0;
               int temp1=0;
                if(Map1.containsKey(i)){temp1 = Map1.get(i);}
                if(Map2.containsKey(i)){temp2 = Map2.get(i);}
               temp1=temp1+temp2;
               obj.add(temp1);
               Ret.add(obj);
           }
            i++;
        }
        return Ret;
    }
}