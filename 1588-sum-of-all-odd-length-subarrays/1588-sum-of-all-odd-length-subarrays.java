class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        
        int sum=0;
         int length=0;
        if(arr.length%2!=0){
            length=(arr.length+1)/2;
        }
        else{
            length=arr.length/2;
        }
        // System.out.println(length);
        int c=1;
        for(int i=0;i<length;i++){
            for(int j=0;j<arr.length && ite<=arr.length;j++){
                sum+=Oddsum(arr,j);
            }
            c+=2;
            ite=c;
             System.out.println("C"+"  "+ite);
        }
        
        return sum;
        
    }
        int ite=1;
        
        public int Oddsum(int arr[],int j){
    
            int sum=0;
            while( j< ite){
                sum+=arr[j];
                j++;
            }
            System.out.println(ite);
            ite++;
            return sum;
        
        }
}