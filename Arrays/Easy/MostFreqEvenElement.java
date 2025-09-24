class Solution {
    public int mostFrequentEven(int[] nums) {

        int ans = -1; // element
        int max = 0; // frequency

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int n: nums) {
            if( n % 2 == 0 ) {
                int f = map.getOrDefault( n , 0 ) + 1;
                map.put( n , f );

                if( f > max || (f == max && n < ans) ) {
                    max = f;
                    ans = n;
                }
            }
        }
        return ans;
    }
}
