class Solution {
    //O(n)
    public int maxSubArray(int[] nums) {
        //return maxSubArrayBF(nums);

        int curr = 0;
        int max = nums[0];
        for(int i=0 ; i<nums.length ; i++){
            if(curr < 0){
                curr = 0;
            }
            curr += nums[i];
            max = Math.max(curr,max);
        }
        return max;
    }

    //O(n2)
    public int maxSubArrayBF(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        for(int i=0 ; i<nums.length ; i++){
            int currSum = 0;
            for(int j=i ; j<nums.length ; j++){
                currSum +=nums[j];
                maxSum = Math.max(currSum,maxSum);
            }
        }
        return maxSum;
    }
}
