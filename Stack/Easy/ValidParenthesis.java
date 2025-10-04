class Solution {
    public boolean isValid(String s) {
        HashMap<Character,Character> map = new HashMap<>();
        map.put(')','(');
        map.put('}','{');
        map.put(']','[');

        Stack<Character> stk = new Stack<>();

        for(int i=0 ; i<s.length() ; i++) {
            char c = s.charAt(i);

            // A. If the current character is a closing bracket
            if (map.containsKey(c)) {

            // Condition 1: Check if the stack is empty.
            // If the stack is empty, it means we have a closing bracket with no unmatched opening bracket.
            char topElement = stk.empty() ? '#' : stk.pop();

            // Condition 2: Check for a mismatch.
            // The popped opening bracket must match the current closing bracket.
                if (topElement != map.get(c)) {
                    return false;
                }
            }
            else {
                // B. If the current character is an opening bracket, push it onto the stack.
                stk.push(c);
            }
        }
        // 3. Final Check: After iterating through the entire string, the stack must be empty.
        // If it's not empty (e.g., "(["), it means we have unmatched opening brackets.
        return stk.empty();
    }
}




/*
import java.util.*;
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        for(char ch:s.toCharArray())
        {
            if(ch=='{'||ch=='['||ch=='(')
            {
                stack.push(ch);
            }
            else
            {
                if(stack.isEmpty())
                {
                    return false;
                }
                char top=stack.pop();
                if((ch=='}' && top!='{' || ch==']' && top!='[' || ch==')' && top!='('))
                {
                    return false;
                }
            }
        }
        return stack.isEmpty();
              
    }
}
*/
