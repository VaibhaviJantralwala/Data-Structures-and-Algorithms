class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        
        Stack<Integer> stk = new Stack<>();

        for(int a : asteroids ){

            // collision only when stack top is +ve and curr is -ve 
            while( !stk.isEmpty() && stk.peek() > 0 && a < 0 && stk.peek() < -a){

                stk.pop(); // top explodes
            }

                if( !stk.isEmpty() && stk.peek() > 0 && a < 0 ){
                    if( stk.peek() == -a ) stk.pop(); // both explodes
                }
                else{
                    stk.push(a);
                }
        }

        int[] ans = new int[stk.size()]; 

        for (int i = ans.length - 1; i >= 0; i--) { 
            ans[i] = stk.pop(); 
        } 
        
        return ans;
    }
}
