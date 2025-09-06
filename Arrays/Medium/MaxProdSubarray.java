class Solution {
    //O(n)
    public int maxProduct(int[] nums) {
        //return maxProductBruteForce(nums);
        
        int maxProd = nums[0];
        int minProd = nums[0];
        int result = nums[0];

        for(int i=1 ; i<nums.length ; i++) {
            int currElement = nums[i];
            if( currElement < 0 ){
                //swap min and max
                int temp = maxProd;
                maxProd = minProd;
                minProd = temp;
            }
            maxProd = Math.max( currElement , currElement*maxProd );
            minProd = Math.min( currElement , currElement*minProd );
            result = Math.max( maxProd , result );
        }
        return result;
    }

    //O(n2)
    public int maxProductBruteForce(int[] nums) {
        int maxProd = nums[0];
        for(int i=0 ; i<nums.length ; i++) {
            int currProd = 1;
            for(int j=0 ; j<nums.length ; j++) {
                currProd *=nums[j];
                maxProd = Math.max( currProd , maxProd);
            }
        }
        return maxProd;
    }
}
