class Solution {
    public String minWindow(String s, String t) {

        if( s == null || t == null || s.length() == 0 || t.length() == 0 ){
            return "";
        }

        int left = 0 , right = 0;
        int start = 0;
        int req = t.length();
        int minLen = Integer.MAX_VALUE;

        int freq[] = new int[128];
        for( char c : t.toCharArray() ){
            freq[c]++;
        }

        for( right = 0 ; right < s.length() ; right++ ){

            char r = s.charAt(right);

            if( freq[r] > 0 ){
                req--;
            }
            freq[r]--;

            while( req == 0 ){

                if( right - left + 1 < minLen ){
                    minLen = right - left + 1;
                    start = left;
                }

                char l = s.charAt(left);
                freq[l]++;

                if( freq[l] > 0 ){
                    req++;
                }

                left++;
            }
        }
        return minLen == Integer.MAX_VALUE ? "" : s.substring(start , start + minLen );
        
        // Another Solution

        // if( s == null || t == null || s.length() == 0 || t.length() == 0 ){
        //     return "";
        // }

        // int mapS[] = new int[256];
        // int mapT[] = new int[256];

        // for(char c : t.toCharArray() ) mapT[c]++;

        // int left = 0 , right = 0 , minStart = 0 , minLen = Integer.MAX_VALUE;

        // for(right =0 ; right < s.length() ; right++){

        //     mapS[s.charAt(right)]++;

        //     while( contains( mapS , mapT ) ){
        //         if( right - left + 1 < minLen ){
        //             minLen = right - left + 1;
        //             minStart = left;
        //         }
        //         mapS[s.charAt(left++)]--;
        //     }
        // }
        // return minLen == Integer.MAX_VALUE ? "" : s.substring( minStart , minStart + minLen );
    }

    private boolean contains( int[] mapS , int[] mapT ){
        for( int i=0 ; i<256 ; i++ ){
            if( mapT[i] > mapS[i] ){
                return false;
            }
        }
        return true;
    }
}
