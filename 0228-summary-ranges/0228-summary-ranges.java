class Solution {
    public List<String> summaryRanges(int[] nums) {
        
        List<String>obj = new ArrayList<>();
        
        for(int i=0;i<nums.length;i++){
            String s="";
            s+=String.valueOf(nums[i]);
            for(int j=i;j<nums.length-1;j++){
                if(nums[j]+1==nums[j+1]){
                    if(j+1==nums.length-1){s+="->";s+=String.valueOf(nums[j+1]); i=j+1; break;}
                }
                else{
                    s+="->";
                    s+=String.valueOf(nums[j]);i=j;
                    int t=s.indexOf('-',1);
                    if(s.substring(0,t).equals(s.substring(t+2,s.length()))){s=s.substring(0,t);}
                    break;}
                }
            obj.add(s);
        }
        
        return obj;
        
    }
}