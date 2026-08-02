class Solution {
    static int smallestSumSubarray(int a[], int size) {
        // your code here
        
        int bestEnding = a[0];
        int result = a[0];
        
        for( int i=1 ; i<size ; i++){
            
            int val1 = a[i];
            int val2 = bestEnding + a[i];
            
            bestEnding = Math.min( val1 , val2 );
            result = Math.min( result , bestEnding );
            
        }
        return result;
    }
}
