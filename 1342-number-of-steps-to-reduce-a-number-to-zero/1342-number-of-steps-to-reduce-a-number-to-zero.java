class Solution {
    public int numberOfSteps(int num) {
        int x=0;
        while(num!=0){
            if(num%2==0){
                num /= 2;
            }else{
                num -= 1;
            }
            x++;
        }
        return x;
    }
}