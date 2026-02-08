STACK solution :: TC : O( n + m ) , SC :  O( n + m ) due to stack

class Solution {
    public boolean backspaceCompare(String s, String t) {

        Stack <Character> stk1 = new Stack<>();
        Stack <Character> stk2 = new Stack<>();

        for(int i=0 ; i<s.length() ; i++){
            if( s.charAt(i) == '#' ){
                if (!stk1.isEmpty()) {
                    stk1.pop();
                }
            }else{
                stk1.push(s.charAt(i));
            }
        }
        for(int i=0 ; i<t.length() ; i++){
            if( t.charAt(i) == '#' ){
                if (!stk2.isEmpty()) {
                    stk2.pop();
                }
            }else{
                stk2.push(t.charAt(i));
            }
        }

        return stk1.equals(stk2);
    }
}

---
USING TWO POINTER APPROACH : TC = O( n + m ) . SC = O( 1 ). 
class Solution {
    public boolean backspaceCompare(String s, String t) {

        int i = s.length()-1 , j = t.length()-1;
        int skipS = 0 , skipT = 0;

        while( i>=0 || j>=0 ){

            while( i >= 0 ){
                if( s.charAt(i) == '#' ){
                    skipS++;
                    i--;
                }else if( skipS > 0 ){
                    skipS--;
                    i--;
                }else {
                    break;
                }
            }
            while( j >= 0 ){
                if( t.charAt(j) == '#' ){
                    skipT++;
                    j--;
                }else if( skipT > 0 ){
                    skipT--;
                    j--;
                }else {
                    break;
                }
            }

            char chS = (i >= 0) ? s.charAt(i) : '\0';
            char chT = (j >= 0) ? t.charAt(j) : '\0';

            if( chS != chT ) return false;
            
            i--;
            j--;
        }
        return true;
    }
}
