class Solution {
    public boolean buddyStrings(String s, String goal) {
        
       if(s.length()!=goal.length()){
            return false;
        }
        if(s.equals(goal)){
            HashMap<Character,Integer> map = new HashMap<>();
            for(int i=0;i<s.length();i++){
                map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
            }
            for(int t : map.values()){
                if(t>1){return true;}
            }
            return false;
        }
        
        int i=0;
        int j=s.length()-1;
        int x = j+1;
        char arr[] = s.toCharArray();
        while(i<x && j>=0){
            if( arr[i] == goal.charAt(i) ){
                i++;
            }
            else if(arr[j] == goal.charAt(j)){
                j--;   
            }
            else if(s.charAt(i)!=goal.charAt(i) && s.charAt(j)!=goal.charAt(j)){
                char t = arr[j];
                arr[j] = arr[i];
                arr[i] = t;
                break;
            }
        }
        String str = new String(arr);  
        if(goal.equals(str)){return true;}
        
        
        return false;
        
    }
}



// if(s.equals(goal)){
            
//             return false;
//         }
            
//             char arr1[] = s.toCharArray();
//             char arr2[] = goal.toCharArray();
//             Arrays.sort(arr1);
//             Arrays.sort(arr2);

//         if(arr1.length!=arr2.length){return false;}
//         for(int i=0;i<arr1.length;i++){
//         if(arr1[i]!=arr2[i]){return false;}
//         }
//         return true;




// if(s.equals(goal)){return false;}
//         char arr1[] = s.toCharArray();
//         char arr2[] = goal.toCharArray();
//         Arrays.sort(arr1);
//         Arrays.sort(arr2);
        
//         if(arr1.length!=arr2.length){return false;}
//         for(int i=0;i<arr1.length;i++){
//             if(arr1[i]!=arr2[i]){return false;}
//         }
//         return true;





        