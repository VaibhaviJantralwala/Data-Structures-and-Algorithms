class Solution {
    public int calculate(String s) {
        
        Deque<Integer> stk = new ArrayDeque<>();
        
        int num = 0 , result = 0 , sign = 1;

        for( char ch : s.toCharArray() ){

            if( Character.isDigit(ch)){
                num = num*10 + ( ch - '0');
            }
            else if( ch == '+' ){
                result += ( num * sign );
                sign = 1;
                num = 0;
            }
            else if( ch == '-' ){
                result += ( num * sign );
                sign = -1;
                num = 0;
            }
            else if( ch == '(' ){
                stk.push( result );
                stk.push(sign);
                result = 0;
                sign = 1;
                num = 0;
            }
            else if( ch == ')' ){

                result += ( num * sign);
                num = 0;

                int stk_sign = stk.pop();
                int last_res = stk.pop();

                result *= stk_sign;
                result += last_res;
            }
        }
        result += ( num * sign);
        return result;
    }
}
