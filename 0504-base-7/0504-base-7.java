class Solution {
    public String convertToBase7(int num) {
     
        if(num==0){return "0";}
        
	   int n=num;
	   String s="";
      
        int i=8;
        int t=0;
        
        int pos=1;
        if(n<0){pos=0;}
        n=Math.abs(n);
        
       
	  
     while(i>=0){
	  
	   int j=1;
	   t=0;
	 
	 
	   if(n%(int)Math.pow(7,i)<n){
	      t = n%(int)Math.pow(7,i);
	 
	    while((j*Math.pow(7,i))<=n){
	      j++;
	    } 
	    j--;
	    n=t;
	    s+=j;
	   
	   t=0;
	  }
	  
	   else{
	       s+=0;
	   }
	  
	   i--;
	  }
	  
	  i=0;
	 
	  while(s.charAt(i)=='0'){
	      i++;
	  }
	  
	  s=s.substring(i,s.length());
	   
        if(pos==0){s='-'+s;}
        
	  return (s);
	   
        
    }
}