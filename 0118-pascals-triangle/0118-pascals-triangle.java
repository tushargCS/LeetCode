class Solution {
    public List<List<Integer>> generate(int R) {
        
        List<List<Integer>> M = new ArrayList<>();
      List<Integer> obj1 = new ArrayList<>();
        obj1.add(1);
         M.add(obj1);
        
         for(int i=1;i<R;i++){
               List<Integer> obj = new ArrayList<>();
              obj.add(1);
            System.out.println(obj);
            for(int j=1;j<i;j++){
                 System.out.println(i+"   "+j);
                  System.out.println(M.get(i-1));
                  System.out.println(M.get(i-1).get(j-1));
                  obj.add(M.get(i-1).get(j-1)+M.get(i-1).get(j));
            }
            obj.add(1);
             System.out.println(obj);
             System.out.println(M);
             M.add(obj);
            System.out.println(M);
            
    }
        
        
        return M;
    }
}