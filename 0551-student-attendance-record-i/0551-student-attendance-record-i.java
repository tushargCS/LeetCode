class Solution {
    public boolean checkRecord(String s) {
        
        char arr[] = s.toCharArray();
        
        int absent=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='A'){absent++;}
            if(absent>=2){return false;}
        }
        
        
        int late=0;
        for(int i=0;i<s.length()-2;i++){
            if(arr[i]=='L' && arr[i+1]=='L' && arr[i+2]=='L'){return false;}
            
        }
        
        return true;
    }
}