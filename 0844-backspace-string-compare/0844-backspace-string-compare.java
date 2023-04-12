class Solution {
    public boolean backspaceCompare(String s, String t) {
        char arr1[] = s.toCharArray();
        char arr2[] = t.toCharArray();
        int icount=0;
        
        int flag=0;
        
        for(int i=arr1.length-1;i>=0;){
            while(i>=0 && arr1[i]=='#'){
                icount++;
                i--;
                flag=1;
            }
            while(i>=0 && icount>0){
                if(arr1[i]!='#'){
                    arr1[i]='-';
                    i--;
                    icount--;
                }
                else if(arr1[i]=='#'){
                    icount++;
                     i--;
                }
                else{i--;}
            }
            if(flag==0){i--;}
            flag=0;
        }
                                                                                    // for(int i=0;i<arr1.length;i++){
                                                                                    //     System.out.print(arr1[i]);
                                                                                    // }
                                                                                    // System.out.println();
        
        icount=0;
        flag=0;
         for(int i=arr2.length-1;i>=0;){
            while(i>=0 && arr2[i]=='#'){
                icount++;
                i--;
                // System.out.println(i);
                flag=1;
            }
            while(i>=0 && icount>0){
                if(arr2[i]!='#'){
                    arr2[i]='-';
                    i--;
                    icount--;
                }
                else if(arr2[i]=='#'){
                    icount++;
                     i--;
                }
                else{i--;}
            }
             
            if(flag==0){i--;}
            flag=0;
        }
        
                                                                                            // for(int i=0;i<arr2.length;i++){
                                                                                            //     System.out.print(arr2[i]);
                                                                                            // }
                                                                                            // System.out.println();
        
       StringBuilder sb1 = new StringBuilder();
       StringBuilder sb2 = new StringBuilder();
        
        for(int i=0;i<arr1.length;i++){
            if( arr1[i]!='-' && arr1[i]!='#'){sb1.append(arr1[i]);}
        }
        for(int i=0;i<arr2.length;i++){
            if( arr2[i]!='-' && arr2[i]!='#'){sb2.append(arr2[i]);}
        }
        
         // System.out.println(sb1);
         // System.out.println(sb2);
        
        if(sb1.toString().equals(sb2.toString())){return true;}
        else{return false;}
    }
}