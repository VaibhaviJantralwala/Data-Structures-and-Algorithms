class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();

        if( matrix.length == 0 || matrix == null ) return result;

        int n = matrix.length; //  row length
        int m = matrix[0].length; // col length

        //boundary pointers
        int left = 0;
        int right = m-1;
        int top = 0;
        int bottom = n-1;

        while( top <= bottom && left <= right ) {

            // left to right
            for(int i=left ; i<=right ; i++) {
                result.add(matrix[top][i]);
            }top++;

            // top to bottom
            for(int i=top ; i<=bottom ; i++) {
                result.add(matrix[i][right]);
            }right--;

            // Traverse Left (if rows still exist)
            if( top <= bottom ) {
                // right to left
                for(int i=right ; i>=left ; i--) {
                result.add(matrix[bottom][i]);
                }bottom--;
            }

            // Traverse Up (if columns still exist)
            if (left <= right) {
                // bottom to top
                for(int i=bottom ; i>=top ; i--) {
                result.add(matrix[i][left]);
                }left++;
            }
        }
        return result;
    }
}
