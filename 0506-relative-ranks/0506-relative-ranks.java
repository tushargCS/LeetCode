class Solution {
    public String[] findRelativeRanks(int[] score) {
        
        HashMap<Integer,String>Map = new HashMap<>();
        
        int arr[]= new int[score.length];
        
        for(int i=0;i<arr.length;i++){
            arr[i]=score[i];
        }
        
        
        Arrays.sort(arr);
        
        for (int i = 0; i < arr.length / 2; i++) {
             int temp = arr[i];
             arr[i] = arr[arr.length - i - 1];
             arr[arr.length - i - 1] = temp;
        }
        
        
        for(int i=0;i<arr.length;i++){
             if(i==0){Map.put(arr[i],"Gold Medal");}
             else if(i==1){Map.put(arr[i],"Silver Medal");}
             else if(i==2){Map.put(arr[i],"Bronze Medal");}
             else{
                 String t = String.valueOf(i+1);
                 Map.put(arr[i],t);   
            }
        }
        
        String s[] = new String[arr.length];
        
         for(int i=0;i<arr.length;i++){
            s[i]=Map.get(score[i]);
        }
        
        return s;
        
    }
}