class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        
        int low = 0 , high = p.length()-1 ;
        List<Integer> ans = new ArrayList<>();

        int[] pFreq = new int[26];
        int[] windowFreq = new int[26];

        if (p.length() > s.length()) {
            return ans;
        }

        for( int i=low ; i <= high ; i++){
            char ch = p.charAt(i);
            pFreq[ ch - 'a' ]++;
        }

        for( int i=low ; i <= high ; i++){
            char ch = s.charAt(i);
            windowFreq[ ch - 'a' ]++;
        }

        if(Arrays.equals(pFreq, windowFreq)){
            ans.add(low);
        }

        while( high < s.length()-1 ){

            windowFreq[ s.charAt(low) - 'a' ]--;
            low++;

            high++;
            windowFreq[ s.charAt(high) - 'a' ]++;

            if(Arrays.equals(pFreq, windowFreq)){
                    ans.add(low);
            }

        }
        return ans;
    }
}
