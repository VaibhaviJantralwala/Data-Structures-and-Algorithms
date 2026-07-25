class Solution {
    public boolean checkInclusion(String s1, String s2) {
        
        // fixed window 
        // window size  = length of s1
        // maintain = freq array for both strings 
        // maintain a boolean variable , to check and return 
        // check -> if both array equal ? bool = true else false 

        int low = 0 , high = s1.length() - 1;

        int[] s1Freq = new int[26];
        int[] s2Freq = new int[26];

        if ( s1.length() > s2.length() ){
            return false;
        }

        for( int i=0 ; i<= s1.length()-1 ; i++){

            char ch1 = s1.charAt(i);
            s1Freq[ch1 - 'a']++;

            char ch2 = s2.charAt(i);
            s2Freq[ch2 - 'a']++;
        }

        if( Arrays.equals(s1Freq,s2Freq)){
            return true;
        }

        while( high < s2.length()-1 ){

            s2Freq[ s2.charAt(low) - 'a' ]--;
            low++;

            high++;
            s2Freq[ s2.charAt(high) - 'a' ]++;

            if( Arrays.equals(s1Freq,s2Freq)){
            return true;
            }
        }
        return false;
    }
}
