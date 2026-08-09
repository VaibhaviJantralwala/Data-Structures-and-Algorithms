class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        
        List<int[]> result = new ArrayList<>();

        boolean insert = false;
        int newElement = newInterval[0];

        for( int i=0 ; i<intervals.length ; i++){

            int start = intervals[i][0];
            int end = intervals[i][1];

            if( insert == false && start > newElement ){
                
                insert = true;
                result.add(newInterval);
            }

            result.add( new int[]{start,end});
        }

        if( insert == false ){
            result.add(newInterval);
        }

        int[][] arr = result.toArray(new int[result.size()][]);

        List<int[]> merged = new ArrayList<>();
        
        int start1 = arr[0][0];
        int end1 = arr[0][1];

        for(int i=1 ; i<arr.length ; i++){

            int start2 = arr[i][0];
            int end2 = arr[i][1];

            if( end1 >= start2 ){
                end1 = Math.max( end1 , end2 );
            }
            else{
                merged.add(new int[]{start1, end1});
                start1 = start2;
                end1 = end2;
            }
        }

        merged.add(new int[]{start1, end1});

        return merged.toArray(new int[merged.size()][]);
    }
}
