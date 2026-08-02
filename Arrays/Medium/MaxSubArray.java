class Solution {
    
    public int maxSubArray(int[] nums) {
        
        int bestEnding = nums[0];
        int result = nums[0];

        for( int i=1 ; i<nums.length ; i++){

            int val1 = nums[i];
            int val2 = bestEnding + nums[i];

            bestEnding = Math.max( val1 , val2 );

            result = Math.max( result , bestEnding );
        }

        return result;
    }

    
}
