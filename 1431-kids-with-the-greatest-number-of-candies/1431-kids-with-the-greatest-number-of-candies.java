class Solution {
    public List<Boolean> kidsWithCandies(int[] c, int e) {
        List<Boolean> arr =new ArrayList<>();
        int max=0;
        for(int i=0;i<c.length;i++){
            if(max<c[i]){max=c[i];}
        }
        for(int i=0;i<c.length;i++){
            if(c[i]+e>=max){arr.add(true);}
            else{arr.add(false);}
        }
        return arr;
    }
}