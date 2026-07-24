class Solution {
    public int longestKSubstr(String s, int k) {
        // code here
        
        int low = 0 , high = 0 , result = -1;
        
        HashMap<Character,Integer> map = new HashMap<>();
        
        for( high = 0 ; high < s.length() ; high++ ){
            
            char ch = s.charAt(high);
            map.put(ch, map.getOrDefault(ch,0)+1);
            
            while( map.size() > k ){
                
                char lowCh = s.charAt(low);
                map.put(lowCh , map.get(lowCh)-1);
                if( map.get(lowCh) == 0 ){
                    map.remove(lowCh);
                }
                low++;
            }
            
            if( map.size() == k ){
                int length = high - low + 1;
                result = Math.max(result,length);
            }
        }
        return result;
    }
}
