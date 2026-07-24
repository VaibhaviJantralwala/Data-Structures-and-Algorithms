class Solution {
    public int longestOnes(int[] nums, int k) {

       int low = 0 , high = 0 , maxWindow = 0 , count = 0 ;

       for( high = 0 ; high < nums.length ; high++){
            if( nums[high] == 0 ){
                count++;
            }

             // invalid window
             while( count > k ){
                if( nums[low] == 0 ){
                    count--;
                }
                low++;
            }
            // valid window : count <= k
             maxWindow = Math.max(maxWindow , high - low + 1);
       }

       return maxWindow;
    }
    
}
