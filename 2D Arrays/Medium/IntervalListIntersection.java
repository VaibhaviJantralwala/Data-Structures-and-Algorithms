class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        
        List<int []> result = new ArrayList<>();

        int i=0 , j = 0;

        while( i < firstList.length && j < secondList.length ){

            int start1 = firstList[i][0];
            int end1 = firstList[i][1];

            int start2 = secondList[j][0];
            int end2 = secondList[j][1];

            if( start1 <= start2 ){

                if( end1 >= start2 ){
                    result.add( new int[]{ Math.max(start1,start2), Math.min(end1 , end2)} );
                }
            }
            else{

                if( end2 >= start1 ){
                    result.add( new int[]{ Math.max(start1,start2), Math.min(end1 , end2)} );
                }
            }

            if( end1 <= end2 ) i++;
            else j++;
        }

        return result.toArray(new int[0][]);
    }
}
