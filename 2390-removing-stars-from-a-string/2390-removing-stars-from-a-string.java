class Solution {
    public String removeStars(String s) {
        char arr[] = s.toCharArray();
       int min = arr.length-1;
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]=='*'){
                int j= min<(i-1) ? min : (i-1);
                while(arr[j]=='*' || arr[j]=='-'){j--;}
                min = j;
                arr[j]='-';
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<arr.length;i++){
            if(arr[i]!='-' && arr[i]!='*')
            {sb.append(arr[i]);}
        }
        return sb.toString();
    }
}