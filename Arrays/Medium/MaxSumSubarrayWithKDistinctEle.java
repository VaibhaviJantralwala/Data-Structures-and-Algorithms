class Solution {
    public long maximumSubarraySum(int[] nums, int k) {

        int n = nums.length;
        long sum = 0;
        long max = 0;
        int left = 0 ;

        HashSet<Integer> set = new HashSet<>();

        for( int right = 0 ; right<n ; right++){

            while( set.contains( nums[right] )){
                set.remove( nums[left]);
                sum -= nums[left];
                left++;
            }

            set.add( nums[right]);
            sum += nums[right];
            
            if( right - left + 1 == k ){
                max = Math.max( sum , max);

                set.remove( nums[left]);
                sum -= nums[left];
                left++;
            }
        }
        return max;
    }
}
