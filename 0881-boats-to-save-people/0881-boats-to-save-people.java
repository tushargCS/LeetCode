class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int sum=0;
        int count=0;
        // for(int v:people){
        //     System.out.print(v+" ");
        // }
        int x=0;
        int y=people.length-1;
        while(x<y){
            if(people[x]+people[y]<=limit){
                count++;
                x++;
                y--;
            }
            else{
                y--;
                count+=1;
            }
        }
        if(x==y){
            count++;
        }
        for(int i=x;i<y;i++){
            
            if( i%2 != 0 && i!=0){
                sum+=people[i];
                if(sum<=limit){
                    count++;
                }
                else{count+=2;}
                sum=0;
            }
            else{
                sum+=people[i];
            }
        }
        if(sum!=0){
        if(sum<=limit){
            count++;
        }
        else{count+=2;}
        }
        return count;
    }
}