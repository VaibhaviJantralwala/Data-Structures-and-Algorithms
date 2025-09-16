class Solution {
    public boolean isHappy(int n) {

        //using HahTable
        // HashSet<Integer> set = new HashSet<>();
        // while( n != 1 ) {
        //     n = nextSquaredSum(n);
        //     if(set.contains(n)) return false;
        //     set.add(n);
        // }
        // return true;

        //using fast and slow pointers
        int slow = n;
        int fast = nextSquaredSum(n);
        while( fast != 1 && slow != fast ) {
            slow = nextSquaredSum(slow);
            fast = nextSquaredSum(nextSquaredSum(fast));
        }
        return fast == 1;
    }

    private int nextSquaredSum(int n) {
        int sum = 0;
            while( n > 0 ) {
                int digit = n%10;
                sum += digit*digit;
                n /= 10;
            }
        return sum;
    }
}
