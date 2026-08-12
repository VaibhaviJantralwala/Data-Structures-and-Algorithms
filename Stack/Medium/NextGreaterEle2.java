class Solution {
    public int[] nextGreaterElements(int[] nums) {
        
        Deque<Integer> stk = new ArrayDeque<>();
        
        int[] result = new int[nums.length];

        for( int i=nums.length-2 ; i>=0 ; i-- ){
            stk.push(nums[i]);
        }

        for( int i=nums.length-1 ; i>=0 ; i-- ){

            while( !stk.isEmpty() && stk.peek() <= nums[i] ){
                stk.pop();
            }

            if( stk.isEmpty() ){
                result[i] = -1;
            }
            else{
                result[i] = stk.peek();
            }
            stk.push(nums[i]);
        }

        return result;
    }
}
