class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        
        int totalSum = 0;
        for(int i=0 ; i<nums.length ; i++){
            totalSum += nums[i];
        }

        int maxSumEnd = nums[0];
        int maxSum = nums[0];

        int minSumEnd = nums[0];
        int minSum = nums[0];

        int ans = 0;

        for(int i=1 ; i<nums.length ; i++) {

            maxSumEnd = Math.max( maxSumEnd + nums[i] ,nums[i] );

            maxSum = Math.max( maxSum , maxSumEnd );

            minSumEnd = Math.min( minSumEnd + nums[i] ,nums[i] );

            minSum = Math.min( minSum , minSumEnd );

            ans = totalSum - minSum;
        }

        if( maxSum < 0 ) return maxSum;

        return Math.max( ans , maxSum);
    }
}
