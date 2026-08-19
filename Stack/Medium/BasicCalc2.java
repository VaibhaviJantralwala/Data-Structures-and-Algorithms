class Solution {
    public int calculate(String s) {

        Deque<Integer> stk = new ArrayDeque<>();
        
        int num = 0 ;
        char op = '+';

        for(int i=0 ; i<=s.length() ; i++){

            char ch = ( i == s.length()) ? '+' : s.charAt(i);

            if( Character.isDigit(ch)){
                num = num*10 + ( ch - '0');
            }
            else if( ch != ' '){
                if( op == '+'){
                    stk.push(num);
                }
                else if( op == '-'){
                    stk.push(-num);
                }
                else if( op == '*'){
                    stk.push(stk.pop() * num);
                }
                else if( op == '/'){
                    stk.push(stk.pop() / num);
                }

                op = ch;
                num = 0;
            }
        }
        int ans = 0;
        while( !stk.isEmpty()){
            ans += stk.pop();
        }
        return ans;
    }
}
