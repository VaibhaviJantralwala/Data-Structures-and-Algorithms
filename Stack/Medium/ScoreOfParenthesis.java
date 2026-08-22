class Solution {
    public int scoreOfParentheses(String s) {

        Deque<Integer> stk = new ArrayDeque<>();
        
        int score = 0;

        for( char ch : s.toCharArray() ){
            
            if( ch == '('){
                stk.push(score);
                score = 0;
            }
            else{
                // ch == ')'
                int inside = score;
                score = stk.pop();

                if( inside == 0 ){
                    score += 1;
                }else{
                    score += 2*inside;
                }
            }
        }
        return score;
    }
}
