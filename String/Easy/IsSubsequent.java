class Solution {
    public boolean isSubsequence(String s, String t) {
        
        StringBuilder sb = new StringBuilder();
        if(s.length() == 0){
            return true;
        }
        int j = 0;
        for(int i=0 ; i<t.length() ; i++){
            if( j < s.length() ){
                if(t.charAt(i) == s.charAt(j)){
                sb.append(t.charAt(i));
                j++;
            }
            }
        }
        if(sb.toString().equals(s)){
            return true;
        }else{
            return false;
        }
    }
}
