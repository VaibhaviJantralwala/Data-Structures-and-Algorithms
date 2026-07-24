class Solution {
    public double findMaxAverage(int[] nums, int k) {
        
        int low = 0 , high = k-1 ;
        double result = 0, sum = 0;

        for( int i=low ; i <= high ; i++){
            sum += nums[i];
        }
        double firstAvg = sum / k;
        result = firstAvg;

        while( high < nums.length ){

                sum -= nums[low];
                low++;

                high++;

                 if( high == nums.length ) break;

                sum += nums[high];

                double currAvg = sum / k;

                result = Math.max(currAvg, result);
        }

        return result;
    }

}
