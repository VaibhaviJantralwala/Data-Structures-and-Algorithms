// tc -> O(n) sc = O(1)
class Solution {
    public int longestValidParentheses(String s) {
        
        int max = 0;
        int open = 0;
        int close = 0;

        for( int i=0 ; i<s.length() ; i++){

            if( s.charAt(i) == '('){
                open++;
            }else{
                close++;
            }

            if( open == close ){
                max = Math.max( max , 2*close);
            }

            if( close > open ){
                open = 0;
                close = 0;
            }
        }

        open = 0;
        close = 0;

        for( int i=s.length()-1 ; i>=0 ; i--){

            if( s.charAt(i) == '('){
                open++;
            }else{
                close++;
            }

            if( open == close ){
                max = Math.max( max , 2*close);
            }

            if( open > close ){
                open = 0;
                close = 0;
            }
        }

        return max;
    }
}

// tc -> O(n) sc = O(n)
class Solution {
    public int longestValidParentheses(String s) {
        
        Deque<Integer> stk = new ArrayDeque<>();
        stk.push(-1);

        int max = 0;

        for( int i=0 ; i<s.length() ; i++ ){
            char ch = s.charAt(i);
            if( ch == '(' ){
                stk.push(i);
            }else{
                // ch == ')'
                stk.pop();
                if( stk.isEmpty() ){
                    stk.push(i);
                }else{
                    max = Math.max( max , i-stk.peek() );
                }
            }
        }
        return max;
    }
}
