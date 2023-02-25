class Solution {
    public String reverseOnlyLetters(String s) {
        int i=0;
        int j= s.length()-1;
        StringBuilder sb = new StringBuilder();
        
        char arr[] = s.toCharArray();
        
        while(i<j){
            if(!Character.isAlphabetic(arr[i])){
                i++;
            }
            else if(!Character.isAlphabetic(arr[j])){
                j--;
            }
            else{
                char t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
                i++;
                j--;
            }
        }
        String str1 = new String(arr);
        return str1;
    }
}