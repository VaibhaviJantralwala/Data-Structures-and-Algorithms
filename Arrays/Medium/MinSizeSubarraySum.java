class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        int n = nums.length ; 
        int left = 0 , res = Integer.MAX_VALUE , sum = 0;

        for(int right = 0 ; right<n ; right++ ){
            sum = sum + nums[right];

            while( sum >= target ){
                res = Math.min( res , right - left + 1);
                sum = sum - nums[left];
                left++;
            }
        }
        return res==Integer.MAX_VALUE ? 0 : res;
    }
}
