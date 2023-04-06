class Solution {
    public boolean lemonadeChange(int[] bills) {
        HashMap<Integer,Integer>map  = new HashMap<>();
        
        for(int i=0;i<bills.length;i++){
           map.put(bills[i],map.getOrDefault(bills[i],0)+1); 
            
            if(bills[i]==10){
                if(map.containsKey(5)){
                    int t = map.get(5);
                    if(t==0){
                        return false;
                    }
                    t--;
                    map.put(5,t);
                }
                else{
                    return false;
                }
            }
            else if(bills[i]==20){
                int t1=0;
                int t2=0;
                if(map.containsKey(5)){
                    t1 = map.get(5);
                    if(t1==0){return false;}
                }
                else{
                    return false;
                }
                
                if(map.containsKey(10)){
                    t2 = map.get(10);
                    if(t2==0){
                        if(t1>=3){
                            t1=t1-3;
                            map.put(5,t1);
                        }
                        else{return false;}
                    }
                    else{
                        t2--;
                        t1--;
                        map.put(5,t1);
                        map.put(10,t2);
                    }
                }
                else{
                     if(t1>=3){
                            t1=t1-3;
                            map.put(5,t1);
                        }
                        else{return false;}
                }
            }
            
        }
        return true;
    }
}