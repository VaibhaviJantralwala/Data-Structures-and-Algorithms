class Solution {
    public String makeGood(String s) {
        
        Deque<Character> stk = new ArrayDeque<>();

        for( char ch : s.toCharArray() ){
            if( !stk.isEmpty() && (Math.abs(stk.peek() - ch) == 32) ){
                stk.pop();
            }else{
                stk.push(ch);
            }
        }

        StringBuilder sb = new StringBuilder();
        while( !stk.isEmpty()){
            sb.append(stk.pop());
        }
        return sb.reverse().toString();
    }
}
