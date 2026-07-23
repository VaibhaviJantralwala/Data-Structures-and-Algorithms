class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
        int n = arr.length;
        
        if( n < k ) return -1;

        int sum = 0 , maxSum = Integer.MIN_VALUE;
        for(int i=0 ; i<n ; i++){
            sum += arr[i];
            
            if( i >= k ){
                sum -= arr[i-k];
            }
            
            if( i >= k-1 ){
               maxSum = Math.max( maxSum , sum) ;
            }
        }
        return maxSum;
    }
}

class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
        int n = arr.length;
        int low = 0 , high = k-1;
        int res = 0 , sum = 0;
        
        for(int i=low ; i<=high ; i++){
            sum = sum + arr[i];
        }
        
        while( high <= n ){
            res = Math.max(res , sum);
            low++;
            high++;
            if( high == n ) break;
            sum = sum - arr[low-1];
            sum = sum + arr[high];
        }
        return res;
    }
}
