class Solution {
    public char nextGreatestLetter(char[] l, char target) {
        int i=0;
        int j=(l.length-1);
        int mid = (i+j)/2;
        char r = l[0];
        while(i<=j){
            if(l[mid]<=target){i=mid+1;}
            else if(l[mid]>target){r=l[mid];j = mid-1;}
            mid = (i+j)/2;
        }
       return r;
    }
}