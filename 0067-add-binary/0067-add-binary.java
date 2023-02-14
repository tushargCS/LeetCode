class Solution {
    public String addBinary(String a, String b) {
       
        int i=a.length()-1;
        int j = b.length()-1;
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        
        while(i>=0 && j>=0){
            if(carry==1){
                char a1 = a.charAt(i);
                char b1 = b.charAt(j);
                if(a1=='0' && b1=='0'){
                   sb.append("1"); 
                    carry=0;
                }
                else if(a1=='0' && b1=='1'){
                    sb.append("0");
                }
                else if(a1=='1' && b1=='0'){
                    sb.append("0");
                }
                else{
                    sb.append("1");
                }
            }
            else{
                char a1 = a.charAt(i);
                char b1 = b.charAt(j);
                if(a1=='0' && b1=='0'){
                   sb.append("0"); 
                }
                else if(a1=='0' && b1=='1'){
                    sb.append("1");
                }
                else if(a1=='1' && b1=='0'){
                    sb.append("1");
                }
                else{
                    sb.append("0");
                    carry=1;
                }
            }
            i--;
            j--;
        }
        
        while(i>=0){
            char a1 = a.charAt(i);
            if(carry==1 && a1=='1'){
                sb.append("0");
            }
            else if(carry==1 && a1=='0'){
                sb.append("1");
                carry=0;
            }
            else{
                 sb.append(a1);
            }
            i--;
        }
        
         while(j>=0){
            char a1 = b.charAt(j);
            if(carry==1 && a1=='1'){
                sb.append("0");
            }
            else if(carry==1 && a1=='0'){
                sb.append("1");
                carry=0;
            }
            else{
                 sb.append(a1);
            }
            j--;
        }
        
        if(carry == 1 ){
            sb.append('1');
        }
        sb.reverse();
        return sb.toString();
    }
}