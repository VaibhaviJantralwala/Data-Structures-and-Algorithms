class Solution {
    public int[] nextGreaterElements(int[] nums) {
        
        // Deque<Integer> stk = new ArrayDeque<>();
        // int[] result = new int[nums.length];
        // for( int i=nums.length-2 ; i>=0 ; i-- ){
        //     stk.push(nums[i]);
        // }
        // for( int i=nums.length-1 ; i>=0 ; i-- ){
        //     while( !stk.isEmpty() && stk.peek() <= nums[i] ){
        //         stk.pop();
        //     }
        //     if( stk.isEmpty() ){
        //         result[i] = -1;
        //     }
        //     else{
        //         result[i] = stk.peek();
        //     }
        //     stk.push(nums[i]);
        // }
        // return result;

        int n = nums.length;
        int[] ans = new int[n];
        Arrays.fill(ans , -1);

        Deque<Integer> stk = new ArrayDeque<>();
        for( int i = 2*n-1 ; i>=0 ; i-- ){
            int num = nums[i%n];
            while( !stk.isEmpty() && stk.peek() <= num ){
                stk.pop();
            }
            if( i<n && !stk.isEmpty() ){
                ans[i] = stk.peek();
            }
            stk.push(num);
        }
        return ans;
    }
}
