class Solution {
    public int findDuplicate(int[] nums) {
        int slow = 0 , fast = 0;

        do{
            slow = nums[slow];
            fast = nums[nums[fast]];
        }while( slow != fast );
        
        int slow2 = 0;

        while( slow != slow2 ){
            slow = nums[slow];
            slow2 = nums[slow2];
        }
        return slow;
    }
}
