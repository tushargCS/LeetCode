class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> obj = new ArrayList<>();
        for(int i=left;i<=right;i++){
            int temp = i;
            int flag=0;
            while(temp!=0){
                int t = (temp%10);
                if(t==0){flag=1;break;}
                if(i % t==0){}
                else{flag=1;break;}
                temp = temp/10;
            }
            if(flag==0){obj.add(i);}
        }
        return obj;
    }
}