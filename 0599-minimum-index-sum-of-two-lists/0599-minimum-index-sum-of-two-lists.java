class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
     
        HashMap<String,Integer> Map1 = new HashMap<>();
        
        for(int i=list2.length-1;i>=0;i--){
            Map1.put(list2[i],i);
        }
        
        HashMap<String,Integer> Map2 = new HashMap<>();
        
        int min = Integer.MAX_VALUE;
        for(int i=list1.length-1;i>=0;i--){
            if(Map1.containsKey(list1[i])){
               int t = Map1.get(list1[i]);
               if(min>=(t+i)){min=t+i;Map2.put(list1[i],t+i);}
            }
        }
        //System.out.println(min);
        
        List<String>obj = new ArrayList<>();
        
        for(int i=0;i<list1.length;i++){
            if(Map2.containsKey(list1[i])){
               if(Map2.get(list1[i])==min){obj.add(list1[i]);} 
            }
        }
        String str[] = new String[obj.size()];
        for(int i=0;i<str.length;i++){
            str[i]=obj.get(i);
        }
        return str;
    }
}