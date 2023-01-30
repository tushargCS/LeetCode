class Solution {
    HashMap<Integer,Integer>Map = new HashMap<>();
    public int tribonacci(int n){
         return re(n);
    }
    public int re(int n){
        if(n==0){return 0;}
        if(n==1){return 1;}
        if(n==2){return 1;}
        if(Map.containsKey(n)){return Map.get(n);}
        int t1 = re(n-1);
        int t2 = re(n-2);
        int t3 = re(n-3);
        Map.put(n-1,t1);
        Map.put(n-2,t2);
        Map.put(n-3,t3);
        return t1+t2+t3;
    }
}


// 
//     public int tribonacci(int n) {
        
//         int sum=0;
        
//         for(int i=1;i<=n;i++){
//             int t =0;
//             if(!obj.containsKey(i)){t= re(i); obj.put(i,t);}
//          }
//         while(n>0){
//             sum+=obj.get(n);
//             n--;
//         }
        
//         System.out.println(obj);
//         return sum;
    
//     }
//     public int re(int n){
//         if(n==1){return 0;}
//         if(n==2){return 1;}
//         if(n==3){return 1;}
//         if(obj.containsKey(n)){return obj.get(n);}
//         return re(n-1)+re(n-2);
//     }