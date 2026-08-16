class Solution {
    public int evalRPN(String[] tokens) {
        
        Deque<Integer> stk = new ArrayDeque<>();

        for( String s : tokens ){

            if( s.equals("+") ||  s.equals("-") ||  s.equals("*") ||  s.equals("/") ) {

                int a = stk.pop();
                int b = stk.pop();

                if( s.equals("+") ) stk.push(a+b);
                else if( s.equals("-") ) stk.push(b-a);
                else if( s.equals("*") ) stk.push(a*b);
                else stk.push(b/a);
            }
            else{
                stk.push(Integer.parseInt(s));
            }
        }
        return stk.peek();
    }
}
