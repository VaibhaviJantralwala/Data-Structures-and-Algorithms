class Solution {
    public String minRemoveToMakeValid(String s) {
        
        Deque<Integer> stk = new ArrayDeque<>();
        // Set<Integer> list = new HashSet<>();
        boolean[] remove = new boolean[s.length()];

        for( int i=0 ; i<s.length() ; i++ ){

            char ch = s.charAt(i);

            if( ch == '(' ){
                stk.push(i);
            }
            else if( ch == ')'){
                if(!stk.isEmpty() ){
                    stk.pop();
                }
                else{
                    // list.add(i);
                    remove[i] = true;
                }
            }
        }

        while( !stk.isEmpty() ){
            // list.add(stk.pop());

            remove[stk.pop()] = true;
        }

        StringBuilder sb = new StringBuilder();

        for( int i=0 ; i<s.length() ; i++ ){
            // if( !list.contains(i) ){
            //     sb.append(s.charAt(i));
            // }

            if( !remove[i]){
                sb.append(s.charAt(i));
            }
        }

        return sb.toString();
    }
}
