class Solution {
    public String firstPalindrome(String[] words) {
        
        for(int i=0;i<words.length;i++){
            if(words[i].charAt(words[i].length()-1)==words[i].charAt(0)){
                System.out.println(words[i]);
                int x=0;
                int y=words[i].length()-1;
                while(x<y){
                    if(words[i].charAt(x)!=words[i].charAt(y)){break;}
                    x++;y--;
                }
                if(x>=y){return words[i];}
            }
        }
        
        return "";
    }
}