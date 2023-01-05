class Solution {
    public int findMinArrowShots(int[][] points) {
        
       // sortbyColumn(points,1);
        Arrays.sort(points, (a, b) -> Integer.compare(a[1],b[1]));
        
        int  i = points[0][1];
        int j=1;
        int count=1;
        System.out.println(i);
        while(j<points.length){
            if(points[j][0]<=i){}
            else{i = points[j][1];count++;}
            j++;
        }
        
        return count;
        
    }
    
    public static void sortbyColumn(int arr[][], int col)
    {
        // Using built-in sort function Arrays.sort
        Arrays.sort(arr, new Comparator<int[]>() {
            
          @Override              
          // Compare values according to columns
          public int compare(final int[] entry1, 
                             final int[] entry2) {
  
            // To sort in descending order revert 
            // the '>' Operator
           if (entry1[col] > entry2[col])
                return 1;
            else
                return -1;
          }
        });  // End of function call sort().
    }
}