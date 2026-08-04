class Solution {
    public int findMiddleIndex(int[] nums) {
        
        int sum = 0 , left = 0 , right = 0;

        for(int i=0 ; i<nums.length ; i++){
            sum+= nums[i];
        }

        for(int i=0 ; i<nums.length ; i++){

            right = sum - nums[i] - left;

            if( right == left ){
                return i;
            }

            left += nums[i];
        }

        return -1;
    }
}
