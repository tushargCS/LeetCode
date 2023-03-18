class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int i=0;
        int j=letters.length-1;
        char r=letters[0];
        while(i<=j){
            int mid = (i+j)/2;
            if(letters[mid]<=target){
                i = mid+1;
            }
            else{
                r = letters[mid];
                j = mid-1;
            }
        }
        return r;
    }
}