class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};

        //first occurence
        int left = 0 , right = nums.length - 1;
        while(left <= right ){
            int mid = left + (right-left)/2;
            if( nums[mid] == target ) ans[0] = mid;
            if( nums[mid] >= target ) right = mid-1;
            else left = mid+1;
        }

        //last occurence
        left = 0 ; right = nums.length - 1;
        while(left <= right ){
            int mid = left + (right-left)/2;
            if( nums[mid] == target ) ans[1] = mid;
            if (nums[mid] <= target) left = mid + 1;
            else right = mid - 1;
        }
        return ans;
    }
}
