class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0 ; i<order.length() ; i++){
            map.put(order.charAt(i),i);
        }
        for(int i=0 ; i<words.length-1 ; i++) {
            for(int j=0 ; j<words[i].length() ; j++){
                if( j >= words[i+1].length() ) return false;
                if( words[i].charAt(j) != words[i+1].charAt(j) ){
                    int curr = map.get(words[i].charAt(j));
                    int next = map.get(words[i+1].charAt(j));
                    if(next < curr){
                        return false;
                    }else{
                        break;
                    }
                }
            }
        }
        return true;
    }
}
