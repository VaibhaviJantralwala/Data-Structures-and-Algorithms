class Solution {
    public int longestKSubstr(String s, int k) {
        // code here
        int n = s.length();
        int high = 0,left = 0;
        int res = -1;
        
        Map<Character,Integer> map = new HashMap<>();
        
        for( high = 0 ; high < n ; high++){
            char ch = s.charAt(high);
            
            map.put(ch , map.getOrDefault(ch , 0)+1);
            
            while( map.size() > k ){
                char lowCh = s.charAt(left);
                map.put(lowCh , map.get(lowCh)-1);
                
                if(map.get(lowCh) == 0){
                    map.remove(lowCh);
                }
                left++;
            }
            
            if( map.size() == k ){
                res = Math.max( res , high - left + 1);
            }
        }
        return res;
    }
}
