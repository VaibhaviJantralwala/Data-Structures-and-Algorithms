class Solution {
    public int threeSumClosest(int[] nums, int target) {

        // sort the array
        Arrays.sort(nums);

        int maxDiff = Integer.MAX_VALUE;
        int resultSum = 0;

        for( int i=0 ; i<nums.length-2 ; i++) {
            int left = i+1 , right = nums.length-1;
            while( left < right ) {
                int sum = nums[i] + nums[left] + nums[right];

                if( sum == target ){
                    resultSum = sum;
                    left++;
                    right--;
                    return resultSum;
                }
                else if( sum < target ){
                   left++;
                }
                else{
                    right--;
                }
                int diff = Math.abs(sum-target);

                if( maxDiff > diff ){
                    maxDiff = diff;
                    resultSum = sum;
                }
            }
        }
        return resultSum;
    }
}
