class Solution {
    public int minAddToMakeValid(String s) {
        
        int openBrack = 0;
        int closeBrack = 0;

        for( char ch : s.toCharArray() ){

            if( ch == '(' ){
                openBrack++;
            }else{
                // ch == ')'
                if( openBrack > 0 ){
                    openBrack--;
                }else{
                    closeBrack++;
                }
            }
        }

        return openBrack + closeBrack;
    }
}

class Solution {
    public int minAddToMakeValid(String s) {
        
        Deque<Character> stk = new ArrayDeque<>();

        for( char ch : s.toCharArray() ){

            if( !stk.isEmpty() && stk.peek() == '(' && ch == ')' ){
                stk.pop();
            }else{
                stk.push(ch);
            }
        }

        return stk.size();
    }
}
