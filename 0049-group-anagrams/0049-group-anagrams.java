class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        List<List<String>> obj = new ArrayList<>();
        int flag=0;
        int n = strs.length;
        for(int i=0;i<n;i++){
            if(strs[i].equals("")){flag++;}
        }
        for(int i=0;i<n;i++){
            if(strs[i].equals("")){continue;}
            List<String> temp = new ArrayList<>();
            temp.add(strs[i]);
            for(int j=i+1;j<n;j++){
                boolean b = check(strs[i],strs[j]); 
                if(b==true){temp.add(strs[j]);strs[j]="";}
                                  
            }
            obj.add(temp);
        }
        
        List<String> temp1 = new ArrayList<>();
        int f=0;
        while(flag>0){
            f=1;
            flag--;
            temp1.add("");
        }
       if(f==1) obj.add(temp1);
        return obj;
    }
    
    public boolean check(String s1,String s2){
        if(s1.length()!=s2.length()){return false;}
        int n = s1.length();
        int arr1[] = new int[26];
        int arr2[] = new int[26];
        for(int i=0;i<n;i++){
            arr1[s1.charAt(i)-'a']++;
             arr2[s2.charAt(i)-'a']++;
        }
        
         for(int i=0;i<26;i++){
            if(arr1[i]!=arr2[i]){return false;}
        }
        return true;
    }
}