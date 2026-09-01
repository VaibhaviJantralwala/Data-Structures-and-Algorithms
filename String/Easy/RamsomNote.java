class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        if( magazine.length() < ransomNote.length()) return false;

        int[] freqM = new int[26];

        for( char ch : magazine.toCharArray() ){
            freqM[ ch - 'a']++;
        }

        for( char ch : ransomNote.toCharArray() ){

            freqM[ ch - 'a']--;

            if( freqM[ ch - 'a'] < 0 ){
                return false;
            }
        }
        return true;
        
    }
}
