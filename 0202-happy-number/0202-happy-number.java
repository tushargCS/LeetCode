class Solution {
    public boolean isHappy(int n) {
        HashMap<Integer,Integer> map = new HashMap<>();
        if(n==1){return true;}
        int temp = 0;
        while(temp!=n){
            int t = n;
            temp = 0;
            while(t>0){
                temp += (t%10)*(t%10);
                t=t/10;
            }
            if(n==temp){return true;}
            if(map.containsKey(temp)){return false;}
            else{map.put(temp,1);}
            n = temp;
            temp=0;
        }
        return true;
    }
}