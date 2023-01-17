/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        
        if(n==1){return 1;}
        
        int i=1;
        int j=n;
        int mid=0;
         mid=i+(j-i)/2;
        
      
        ArrayList<Integer> obj = new ArrayList<>();
        
        while(i<=j){
            System.out.println(mid);
            if(isBadVersion(mid)==false){i=mid+1; }
            else{obj.add(i);j=mid-1;}
            mid=i+(j-i)/2;
        }
      
        // System.out.println(obj.size());
        //  int min = obj.get(0);
        //  for(int x=0;x<obj.size();x++){
        //      System.out.println(mid);
        //      min=Math.min(obj.get(x),min);
        //  }
        
        return (int)mid;
        
    }
}