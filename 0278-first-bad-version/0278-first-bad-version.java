/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        
        if(n==1){return 1;}
        
        int i=1;
        int j=n;
        int mid=0;
         mid=i+(j-i)/2;
        
        while(i<=j){
            if(isBadVersion(mid)==false){i=mid+1; }
            else{j=mid-1;}
            mid=i+(j-i)/2;
        }
        
        return (int)mid;
        
    }
}