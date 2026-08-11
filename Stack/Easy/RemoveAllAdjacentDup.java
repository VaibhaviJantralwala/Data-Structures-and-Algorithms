class Solution {
    public String removeDuplicates(String s) {
        
        Deque<Character> stk = new ArrayDeque<>();

        for( int i=0 ; i<s.length() ; i++){

            char ch = s.charAt(i);

            if( !stk.isEmpty() && stk.peek() == ch ){
                stk.pop();
            }else{
                stk.push(ch);
            }

        }

        StringBuilder res = new StringBuilder();

        while( !stk.isEmpty() ){

            res = res.append(stk.pop()) ;
        }

        return res.reverse().toString();
    }
}
