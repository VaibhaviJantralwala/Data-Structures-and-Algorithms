class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        
        int n = temperatures.length;
        int[] result = new int[n];
        result[n-1] = 0;

        Deque<Integer> stk = new ArrayDeque<>();
        stk.push(n-1);

        for( int i=n-2 ; i>=0 ; i-- ){

            while( !stk.isEmpty() && temperatures[stk.peek()] <= temperatures[i] ){
                stk.pop();
            }

            if( stk.isEmpty() ){
                result[i] = 0;
            }else{
                result[i] = stk.peek() - i;
            }

            stk.push(i);
        }

        return result;
    }
}
