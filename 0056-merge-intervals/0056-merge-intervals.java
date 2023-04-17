class Solution {
    public int[][] merge(int[][] intervals) {
        ArrayList<ArrayList<Integer>> o = new ArrayList<>();
        int max=Integer.MIN_VALUE;
        int j=0;
        java.util.Arrays.sort(intervals, new java.util.Comparator<int[]>() {
        public int compare(int[] a, int[] b) {
            return Integer.compare(a[0], b[0]);
        }
        });
        
        for(int i=0;i<intervals.length;i++){
            ArrayList<Integer> t= new ArrayList<>();
            int x = intervals[i][0];
            if(max<x){
                t.add(x);
                int y = intervals[i][1];
                j = i+1;
                while(j<intervals.length && y>=intervals[j][0]){
                    y = Math.max(y,intervals[j][1]) ;
                    j++;
                }
                t.add(Math.max(y,intervals[i][1]));
                o.add(t);
                i=j-1;
            }
            if(max<intervals[j-1][1]){max=intervals[j-1][1];}
        }
        int arr[][] = new int[o.size()][2];
        for(int i=0;i<o.size();i++){
            int a[]  =new int[2];
            a[0] =o.get(i).get(0);
            a[1] =o.get(i).get(1);
            arr[i] = a;
            // System.out.print(o.get(i).get(0)+" ");
            // System.out.println(o.get(i).get(1));
        }
        return arr;
        
    }
}