class Solution {

    static class Pair{
        char ch;
        int count;

        Pair(char ch , int count){
            this.ch = ch;
            this.count = count;
        }
    }

    public String removeDuplicates(String s, int k) {
        
        Deque<Pair> stk = new ArrayDeque<>();

        for( char ch : s.toCharArray() ){

            if( !stk.isEmpty() && stk.peek().ch == ch ){
                stk.peek().count++;

                if( stk.peek().count == k ){
                    stk.pop();
                }
            }

            else{
                stk.push(new Pair(ch,1));
            }
        }

        StringBuilder sb = new StringBuilder();
        
        while( !stk.isEmpty() ){
            Pair p = stk.removeLast();

            for(int i=0 ; i< p.count ; i++ ){
                sb.append(p.ch);
            }
        }

        return sb.toString();   
    }
}
