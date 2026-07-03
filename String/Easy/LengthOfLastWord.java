class Solution {
    public int lengthOfLastWord(String s) {
        int count = 0;
        String[] arr = s.split(" ");
        for(int i=0 ; i<arr.length ; i++){
            if( i == arr.length-1 ){
                count = arr[i].length();
            }
        }
        return count;
    }
}
