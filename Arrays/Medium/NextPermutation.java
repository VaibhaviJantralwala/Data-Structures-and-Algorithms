class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;

        // 1. finding pivot element
        int i = n-2;
        while( i>=0 && nums[i] >= nums[i+1] ) {
            i--;
        }

        // 2. if pivot exists then finding num[j] smaller than nums[i] to swap them
        if( i >= 0 ) {
            int j = n-1;
            while( nums[j] <= nums[i] ) {
                j--;
            }
            // 3. Swap nums[i] and nums[j]
            swap(nums, i, j);
        }

        // 4. Reverse the Suffix (from i+1 to the end)
        // If i < 0, it reverses the entire array (from index 0)
        reverse(nums, i + 1, n - 1);
    }

    // In-place swap function
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    // In-place reverse function for a subarray [start, end]
    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }
}
