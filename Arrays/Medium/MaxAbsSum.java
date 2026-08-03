class Solution {
    public int maxAbsoluteSum(int[] nums) {
        
        int maxSum = nums[0];
        int maxSumEnding = nums[0];

        int minSum = nums[0];
        int minSumEnding = nums[0];

        for( int i=1 ; i<nums.length ; i++) {

           maxSumEnding = Math.max( nums[i], maxSumEnding + nums[i]);
           maxSum = Math.max( maxSum , maxSumEnding);

           minSumEnding = Math.min( nums[i], minSumEnding + nums[i]);
           minSum = Math.min( minSum , minSumEnding);

        }
        return Math.max( maxSum , Math.abs(minSum));
    }
}
