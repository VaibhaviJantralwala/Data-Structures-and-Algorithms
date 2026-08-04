class Solution {
    public int[] leftRightDifference(int[] nums) {
        
        int[] ans = new int[nums.length];

        int sum = 0 , left = 0 , right = 0;

        for(int i=0 ; i<nums.length ; i++){
            sum += nums[i];
        }

        for( int i=0 ; i< nums.length ; i++){

            right = sum - nums[i] - left;

            ans[i] = Math.abs( left - right );

            left += nums[i];
        }

        return ans;
    }
}
