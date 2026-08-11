class Solution {
    public boolean isValid(String s) {
       
       Deque<Character> stk = new ArrayDeque<>();

       for( char ch : s.toCharArray() ){

            // opening bracket
            if( ch == '(' || ch == '[' || ch == '{' ){
                stk.push(ch);
            }
            // closing bracket
            else{

                if( stk.isEmpty() ){
                    return false;
                }

                char top = stk.pop();

                if( ( ch == '}' && top != '{' ) || ( ch == ']' && top != '[' ) || ( ch == ')' && top != '(' ) ){
                    return false;
                }
            }
       }

       return stk.isEmpty();
    }
}
