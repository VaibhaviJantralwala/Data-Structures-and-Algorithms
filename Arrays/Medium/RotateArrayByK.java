class Solution {

    //O(n)
    public void rotate(int[] nums, int k) {
        //rotateBruteForce(nums,k);

        int n= nums.length;
        k = k%n; // when k is greater than n

        reverse(nums,0,n-1); // Step 1: Reverse the entire array
        reverse(nums,0,k-1); // Step 2: Reverse the first k elements
        reverse(nums,k,n-1); // Step 3: Reverse the remaining elements
    }

    // Helper method to reverse a subarray
    private static void reverse(int[] nums,int left , int right) {
        while( left < right ) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }

    //O(n*k)
    public void rotateBruteForce(int[] nums, int k) {
        int n= nums.length;
        k = k%n; // when k is greater than n
        for(int i=0 ; i<k ; i++) {
            int lastElement = nums[n-1];
            for(int j=n-1 ; j>0 ; j--) {
                nums[j] = nums[j-1];
            }
            nums[0] = lastElement;
        }
    }
}
