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
