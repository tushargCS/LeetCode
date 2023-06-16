class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character,Integer>map = new HashMap<>();
        char[]a = text.toCharArray();
        for(int i=0;i<a.length;i++){
            map.put(a[i],map.getOrDefault(a[i],0)+1);
        }
        int r=0;
        char arr[] = {'b','a','l','l','o','o','n'};
        while(true){
            int flag=0;
            for(int i=0;i<arr.length;i++){
                 if(map.containsKey(arr[i]) && map.get(arr[i])>0){
                    int t = map.get(arr[i]);
                     map.put(arr[i],--t);
                 }else{
                     flag=1;
                     break;
                 }   
            }
            if(flag==1){break;}
            else{r++;}
        }
        
        return r;
    }
}