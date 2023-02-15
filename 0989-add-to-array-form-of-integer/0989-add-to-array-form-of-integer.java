class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
       
        List<Integer> obj =new ArrayList<>();
        List<Integer> o =new ArrayList<>();
        while(k!=0){
            o.add(k%10);
            k = k/10;
        }
        
       // System.out.println(o);
        
        int x = num.length;
        int y = o.size()-1;
        int i=num.length-1;
        int j=0;
        int carry=0;
        while(i>=0 && j<=y){
            if(carry==0){
               if(num[i]+carry+o.get(j) <10)
                {obj.add(num[i]+carry+o.get(j));}
                else{obj.add((num[i]+carry+o.get(j))%10);
                carry = ( num[i]+carry+o.get(j) )/10;}
            }
            else{
                 if(num[i]+carry+o.get(j) <10)
                {obj.add(num[i]+carry+o.get(j));carry=0;}
                else{obj.add((num[i]+carry+o.get(j))%10);
                carry = ( num[i]+carry+o.get(j) )/10;}
            }
            i--;
            j++;
        }
        
        //System.out.println(carry);
        
        while(i>=0){
            if(carry==0){
               if(num[i]+carry<10)
                {obj.add(num[i]+carry);}
                else{obj.add((num[i]+carry)%10);
                carry = ( num[i]+carry )/10;}
            }
            else{
                 if(num[i]+carry<10)
                {obj.add(num[i]+carry);carry=0;}
                else{obj.add((num[i]+carry)%10);
                carry = ( num[i]+carry )/10;}
            }
            i--; 
        }
        while(j<=y){
             if(carry==0){
               if(carry+o.get(j) <10)
                {obj.add(carry+o.get(j));}
                else{obj.add((carry+o.get(j))%10);
                carry = ( carry+o.get(j) )/10;}
            }
            else{
                 if(carry+o.get(j) <10)
                {obj.add(carry+o.get(j));carry=0;}
                else{obj.add((carry+o.get(j))%10);
                carry = ( carry+o.get(j) )/10;}
            }
            j++;
        }
        
        if(carry!=0){
            obj.add(carry);
        }
        
        o.clear();
        for(int f=obj.size()-1;f>=0;f--){
            o.add(obj.get(f));
        }
        
        return o;
        
    }
}