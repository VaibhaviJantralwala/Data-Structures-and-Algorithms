class Solution {
    
    public int maxProduct(int[] nums) {

        int minEnding = nums[0];
        int maxEnding = nums[0];
        int result = nums[0];

        for( int i=1 ; i<nums.length ; i++){

            int val1 = nums[i];
            int val2 = minEnding * nums[i];
            int val3 = maxEnding * nums[i];

            maxEnding = Math.max( val1 , Math.max( val2 , val3 ) );
            minEnding = Math.min( val1 , Math.min( val2 , val3 ) );

            result = Math.max( result , maxEnding);
        }
        
        return result;
    }
}
