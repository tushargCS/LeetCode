class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        // Arrays.sort(spells);
        Arrays.sort(potions);
        
        ArrayList<Integer> obj =new ArrayList<>();
        for(int i=0;i<spells.length;i++){
            long t1 = spells[i];
           
           
                if( t1*potions[potions.length-1] < success){ obj.add(0);}
            else{
                int c = 0;
                int d = potions.length-1;
                int mid=0;    
                while(c<=d){
                    mid = (c+d)/2;
                    if(potions[mid]*t1 >= success){d = mid-1;}
                    else if(potions[mid]*t1< success){ c = mid+1;}
                }
                
                if( t1*potions[c] >= success){
                    obj.add(potions.length-c);
                }
            }
        }
        
        int arr[] = new int[obj.size()];
        int x=0;
        for(int v:obj){
            arr[x++] = v;
        }
        return arr;
    }
}