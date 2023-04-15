class Solution {
    public String toGoatLatin(String s) {
        String[]arr = s.split(" ");
        for(int i=0;i<arr.length;i++){
            
            StringBuilder temp  = new StringBuilder();
            
            if(arr[i].charAt(0)=='a' || arr[i].charAt(0)=='e' || arr[i].charAt(0)=='i' || arr[i].charAt(0)=='o' || arr[i].charAt(0)=='u' ||
              arr[i].charAt(0)=='A' || arr[i].charAt(0)=='E' || arr[i].charAt(0)=='I' || arr[i].charAt(0)=='O' || arr[i].charAt(0)=='U'
              ){
                //System.out.println(arr[i].substring(1));
                temp.append(arr[i]);
                temp.append("ma");
                int t = i+1;
                while(t>0){
                    temp.append('a');
                    t--;
                }
                 // System.out.println(temp);
                arr[i] = temp.toString();
            }
            
            else{
                char c = arr[i].charAt(0);
                temp.append(arr[i].substring(1));
                temp.append(c);
                temp.append("ma");
                int t = i+1;
                while(t>0){
                    temp.append('a');
                    t--;
                }
                arr[i] = temp.toString();
            }
            
        }
       StringBuffer sb = new StringBuffer();
      for(int i = 0; i < arr.length; i++) {
         sb.append(arr[i]+" ");
      }
      String str = sb.toString();
        return str.substring(0,str.length()-1); 
    }
}