class Solution {
    public int findUnsortedSubarray(int[] nums) {
        
        int n = nums.length;

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        int start = -1 , end = -1;

        for(int i=0 ; i<n ; i++){
            if(nums[i] >= max){
                max = nums[i];
            }else{
                end = i;
            }
        }

        for(int i = n-1 ; i>=0 ; i--){
            if(nums[i] <= min){
                min = nums[i];
            }else{
                start = i;
            }
        }

        if(start == -1) return 0;

        return end - start + 1;
    }
}
