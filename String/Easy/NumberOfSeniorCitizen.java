class Solution {
    public int countSeniors(String[] details) {
        int count = 0;
        
        for(int i=0 ; i<details.length ; i++){
            int subStr = Integer.parseInt( details[i].substring(11,13) );
            if( subStr > 60 ){
                count++;
            }
        }
        return count;
    }
}
