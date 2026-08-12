class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        int n = nums1.length;
        int[] result = new int[n];

        Deque<Integer> stk = new ArrayDeque<>();
        Map<Integer,Integer> map = new HashMap<>();

        int m = nums2.length;
        stk.push(nums2[m-1]);
        map.put(nums2[m-1], -1);

        for( int i= m-2 ; i>=0 ; i--){

            while( !stk.isEmpty() && stk.peek() < nums2[i] ){
                stk.pop();
            }

            int next = stk.isEmpty() ? -1 : stk.peek();

            map.put( nums2[i] , next );

            stk.push( nums2[i] );
        }

        for( int i=0 ; i<n ; i++){

            result[i] = map.get(nums1[i]);
        }

        return result;
    }
}
