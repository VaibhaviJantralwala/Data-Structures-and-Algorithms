class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0;
        int currCount = 0;
        for(int num : nums) {
            if( num == 1 ) {
                currCount++;
            }else {
                if(currCount > maxCount) {
                    maxCount = currCount;
                }
                currCount = 0;
            }
        }
        if(currCount > maxCount) {
            maxCount = currCount;
        }
        return maxCount;
    }
}
