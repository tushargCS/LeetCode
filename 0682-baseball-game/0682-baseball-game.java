class Solution {
    public int calPoints(String[] o) {
        Stack<Integer> st = new Stack();
        for(int i=0;i<o.length;i++){
            if(o[i].equals("+")){
                int s1 = st.pop();
                int s2 = st.pop();
                int s3 = s1+s2;
                st.add(s2);
                st.add(s1);
                st.add(s3);
                //System.out.println(s1+"  "+s2+"  "+s3);
            }
            else  if(o[i].equals("C")){
                st.pop();
            }
            else  if(o[i].equals("D")){
                 int s1 = st.pop();
                 int s2 = 2*s1;
                 st.add(s1);
                 st.add(s2);
                //System.out.println(s1+"  "+s2);
            }
            else{
                st.add(Integer.parseInt(o[i]));
                //System.out.println(Integer.parseInt(o[i]));
            }
        }
        int sum=0;
        for(int t:st){
            sum+=t;
        }
        return sum;
    }
}