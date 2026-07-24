class Solution {
    public int maxVowels(String s, int k) {
        
        int low = 0 , high = k-1 , count = 0 , currCount=0;

        for( int i=low ; i<=high ; i++){
            if( isVowel(s.charAt(i)) ){
                currCount++;
            }
        }
        count = currCount;

        while( high < s.length() ){

            if( isVowel(s.charAt(low)) ){
                currCount--;
            }
            low++;
            
            high++;
            if( high == s.length() ) break;
            if( isVowel(s.charAt(high)) ){
                currCount++;
            }

            count = Math.max(count,currCount);

        }
        return count;
    }

    private boolean isVowel(char ch){
        return  ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
