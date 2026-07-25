class Solution {
    public int numberOfSubstrings(String s) {
        int ans = 0;

        int[] freq = new int[3];

        int low = 0 , high = 0;

        for(high = 0 ; high < s.length() ; high++ ){

            char ch = s.charAt(high);

            freq[ ch - 'a']++;

            // valid window -> freq of a, b , c > 0 
            while( freq[0] > 0 && freq[1] > 0 && freq[2] > 0 ){
                 ans += s.length() - high;

                 freq[ s.charAt(low) - 'a']--;
                 low++;
            }
        }
    
        return ans;
    }
}
