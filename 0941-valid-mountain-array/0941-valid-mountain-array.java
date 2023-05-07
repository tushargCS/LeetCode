class Solution {
    public boolean validMountainArray(int[] arr) {
        if(arr.length<3){return false;}
        int f1=0;
        int f2=1;
        for(int i=0;i<arr.length-1;i++){
            if(f1==0 && arr[i]<arr[i+1]){f2=0;}
            else if(f1==0 && arr[i]>arr[i+1]){f1=1;}
            else if(f1==1 && arr[i]<arr[i+1]){return false;}
            else if(arr[i]==arr[i+1]){return false;}
        }
        
        if(f1==1 && f2==0)
            return true;
        else
            return false;
    }
}