class Solution {
    public int maximalRectangle(char[][] matrix) {
        
        int[] heights = new int[matrix[0].length];
        int maxArea = 0;

        for( int i=0 ; i<matrix.length ; i++) {
            for( int j=0 ; j<heights.length ; j++) {
                if( matrix[i][j] == '1'){
                    heights[j]++;
                }else{
                    heights[j] = 0;
                }
            }

            int area = largestRectangle(heights);
            maxArea = Math.max( maxArea , area);
        }
        return maxArea;
    }

    private int largestRectangle(int[] heights){
        Deque<Integer> stk = new ArrayDeque<>();
        int maxArea = 0;

        for( int i=0 ; i<=heights.length ; i++){
            int currHeight = ( i == heights.length )? 0 : heights[i];

            while( !stk.isEmpty() && currHeight < heights[stk.peek()]){
                int h = heights[stk.pop()];
                int w = ( stk.isEmpty() )? i : i - stk.peek() - 1;

                maxArea = Math.max(maxArea , h*w);
            }
            stk.push(i);
        }
        return maxArea;
    }
}
