class Solution {
    //O(n)
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        //Prefix Product
        result[0] = 1;
        for (int i = 1; i < n; i++) {
            result[i] = result[i - 1] * nums[i - 1];
        }

        //Postfix Product
        int product = 1;
        for(int i=n-1 ; i>=0 ; i--) {
            result[i] = result[i] * product;
            product *= nums[i];
        }
        return result;
    }

    //O(n2)
    public int[] productExceptSeltBF(int[] nums){
        int[] result = new int[nums.length];
        for(int i=0 ; i<nums.length ; i++) {
            int product = 1;
            for(int j=0 ; j<nums.length ; j++) {
                if( i != j ){
                   product *= nums[i]; 
                }
            }
            result[i] = product;
        }
        return result;
    }
}
