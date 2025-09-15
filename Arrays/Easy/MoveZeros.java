class Solution {
    public void moveZeroes(int[] nums) {

        //move non zero elements at first
        int nonZeroEle = 0;
        for(int i=0 ; i<nums.length ; i++) {
            if( nums[i] != 0 ) {
                nums[nonZeroEle] = nums[i];
                nonZeroEle++;
            }
        }

        //place zeros at remaining places
        for(int i = nonZeroEle ; i < nums.length ; i++) {
            nums[i] = 0;
        }
    }
}
