class Solution {
    public String minWindow(String s, String t) {

        int n = s.length();
        int m = t.length();

        if( n < m ) return "";

        int low = 0 , high = 0 , result = Integer.MAX_VALUE , start = 0;

        int[] sFreq = new int[128];
        int[] tFreq = new int[128];

        for(int i=0 ; i<m ; i++){
             tFreq[t.charAt(i)]++;
        }

        for(high = 0 ; high<n ; high++){
            sFreq[s.charAt(high)]++;

            while(contains(sFreq,tFreq)){
                int len = high - low + 1;

                if (len < result) { 
                    result = len; start = low; 
                }

                sFreq[s.charAt(low)]--;
                low++;
            }
        }
        return result == Integer.MAX_VALUE ? "" : s.substring(start, start + result);
    }

    private boolean contains( int[] mapS , int[] mapT ){
        for( int i=0 ; i<128 ; i++ ){
            if( mapT[i] > mapS[i] ){
                return false;
            }
        }
        return true;
    }
}
