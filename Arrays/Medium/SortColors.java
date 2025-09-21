class Solution {
    public void sortColors(int[] nums) {
        int left = 0;
        int right  = nums.length - 1;
        int mid = 0;

        while( mid <= right ) {
            if( nums[mid] == 0 ) {
                //swap left and mid , inc both 
                int temp = nums[left];
                nums[left] = nums[mid];
                nums[mid] = temp;
                left++;
                mid++;
            } else if( nums[mid] == 1 ) {
                mid++;
            } else {
                //swap right and mid  
                int temp = nums[right];
                nums[right] = nums[mid];
                nums[mid] = temp;
                right--;
            }
        }
    }
}
