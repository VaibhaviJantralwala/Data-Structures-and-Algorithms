// User function Template for Java

class Solution {
    public int findMinDiff(ArrayList<Integer> arr, int m) {
        // your code here
        int n = arr.size();
        
        Collections.sort(arr);
        
        int min = Integer.MAX_VALUE;
        
        for(int i=0 ; i+m-1 < n ; i++){
            int diff = arr.get(i+m-1) - arr.get(i);
            
            if( diff < min ){
                min = diff;
            }
        }
        return min;
    }
}
