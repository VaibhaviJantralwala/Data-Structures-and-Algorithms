class Solution {
    public boolean isValidSudoku(char[][] board) {
        int N = 9;

        // Arrays to keep track of seen numbers in rows, columns, and 3x3 boxes.
        // Each set will store the numbers encountered.
        Set<Character>[] rows = new HashSet[N];
        Set<Character>[] cols = new HashSet[N];
        Set<Character>[] boxes = new HashSet[N];

        // Initialize the sets in each array
        for(int i=0 ; i<N ; i++) {
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            boxes[i] = new HashSet<>();
        }

        // Iterate through the board row by row and column by column
        for(int i=0 ; i<N ; i++) {
            for(int j=0 ; j<N ; j++) {
                char currVal = board[i][j];

                // If the cell is empty, skip to the next cell
                if( currVal == '.') {
                    continue;
                }

                // Check if the current number is already in the current row
                if( !rows[i].add(currVal) ){
                    return false;
                }

                // Check if the current number is already in the current column
                if( !cols[j].add(currVal) ){
                    return false;
                }

                // Calculate the index for the 3x3 sub-box
                int boxIndex = ( i / 3 )*3 + ( j / 3 );

                // Check if the current number is already in the 3x3 sub-box
                if( !boxes[boxIndex].add(currVal) ){
                    return false;
                }
            }
        }
        // If all checks pass, the Sudoku board is valid
        return true;
    }
}
