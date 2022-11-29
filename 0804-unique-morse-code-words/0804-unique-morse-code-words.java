class Solution {
    public int uniqueMorseRepresentations(String[] words) {
       HashSet<String>obj = new HashSet<>();
       String s="";
        for(int i=0;i<words.length;i++){
            for(int j=0;j<words[i].length();j++){
                s+=Call(words[i].charAt(j));
            }
            obj.add(s);
            s="";
        }
       
        return obj.size();
        
    }
    
    
    public String Call(char c){
        String arr[]= new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        switch (c){
                case 'a': return arr[0];
                case 'b': return arr[1];
                case 'c': return arr[2];
            case 'd': return arr[3];
            case 'e': return arr[4];
            case 'f': return arr[5];
            case 'g': return arr[6];
            case 'h': return arr[7];
            case 'i':return arr[8];
            case 'j':return arr[9];
            case 'k':return arr[10];
            case 'l':return arr[11];
                  case 'm':return arr[12];
                  case 'n':return arr[13];
                  case 'o':return arr[14];
                  case 'p':return arr[15];
                  case 'q':return arr[16];
                  case 'r':return arr[17];
                  case 's':return arr[18];
                  case 't':return arr[19];
                  case 'u':return arr[20];
                  case 'v':return arr[21];
                 case 'w':return arr[22];
                 case 'x':return arr[23];
                 case 'y':return arr[24];
                 case 'z':return arr[25];
                
        }
        return "";
        }
}