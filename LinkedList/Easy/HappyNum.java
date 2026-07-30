class Solution {
    public boolean isHappy(int n) {

        int slow = n , fast = n;

        do{
            slow = nextNum(slow);
            fast = nextNum(nextNum(fast));
        }while( slow != fast );
        
        return fast == 1;
    }

    // helper function
    private int nextNum(int n){

        int sum = 0;

        while( n > 0 ){
            int digit = n % 10;
            sum += digit*digit;
            n = n / 10;
        }
        return sum;
    }
}
