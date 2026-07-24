class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        int n = nums.length;
        int low = 0 , high = 0 ,sum = 0, result = Integer.MAX_VALUE;

        while( high < n ){
            sum += nums[high];

            while( sum >= target ){
                int len = high - low + 1;
                result = Math.min(result,len);
                sum -= nums[low];
                low++;
            }
            high++;
        }
        
        return result==Integer.MAX_VALUE ? 0 : result;
    }
}
