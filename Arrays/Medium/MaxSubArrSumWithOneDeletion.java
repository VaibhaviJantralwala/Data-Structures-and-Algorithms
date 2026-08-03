class Solution {
    public int maximumSum(int[] arr) {
        
        int noDelete = arr[0];
        int oneDelete = Integer.MIN_VALUE;
        int result = arr[0];

        for( int i = 1 ; i<arr.length ; i++ ) {

            int prevNoDelete = noDelete;
            int prevOneDelete = oneDelete;

            noDelete = Math.max( arr[i], noDelete + arr[i]);

            int val = 0;
            if( prevOneDelete == Integer.MIN_VALUE ){
                val = arr[i];
            }else{
                val = prevOneDelete + arr[i];
            }

            oneDelete = Math.max( val , prevNoDelete );

            result = Math.max( result , Math.max( noDelete , oneDelete ) );
        }
        return result;
    }
}
