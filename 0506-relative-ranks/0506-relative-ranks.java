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
        
         String s[] = new String[arr.length];
        
        for(int i=0;i<arr.length;i++){
             if(i==0){put(score,arr[i],"Gold Medal",s);}
             else if(i==1){put(score,arr[i],"Silver Medal",s);}
             else if(i==2){put(score,arr[i],"Bronze Medal",s);}
             else{
                 String t = String.valueOf(i+1);
                 put(score,arr[i],t,s);   
            }
        }
        
       
        
       
        
        return s;
        
    }
    
    public void put(int score[],int target,String push,String s[] ){
       
        int i=0;
        while(score[i]!=target){
            i++;
        }
        s[i]=push;
    }
}