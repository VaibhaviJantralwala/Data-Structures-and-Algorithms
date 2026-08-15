class Solution {
    public int largestRectangleArea(int[] heights) {
        
        int n = heights.length;
        int maxArea = 0;
        Stack<Integer> stk = new Stack<>();

        for( int i=0 ; i<=n ; i++){
            int currHeight = ( i == n ) ? 0 : heights[i];

            while( !stk.isEmpty() && currHeight < heights[stk.peek()] ){
                int height = heights[stk.pop()];
                int width = ( stk.isEmpty() ) ? i : i - stk.peek() - 1;

                maxArea = Math.max( maxArea , height * width );
            }

            stk.push(i);
        }
        return maxArea;
    }
}
