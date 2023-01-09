class Solution {
    public String convertToBase7(int num) {
      
        
        if(num==0){return "0";}
	    String s="";
        int pos=1;
        if(num<0){pos=0;}
        num=Math.abs(num);
       
        while(num>0){
            s=(num%7)+s;
            num=num/7;
        }

        if(pos==0){s='-'+s;}
        
	    return (s);	   
        
    }
}


        
        
        
        
	  