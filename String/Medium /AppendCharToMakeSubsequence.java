class Solution {
    public int appendCharacters(String s, String t) {

        int count = 0;
        int i=0;
        int j=0;

        while( i < s.length() && j < t.length() ){
            if( s.charAt(i) == t.charAt(j) ){
                i++;
                j++;
            }else{
                i++;
            }
        }
        count = t.length() - j;
        
        return count;
    }
}
