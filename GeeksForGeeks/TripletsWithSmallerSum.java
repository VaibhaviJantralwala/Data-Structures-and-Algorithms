// User function Template for Java

class Solution {
    long countTriplets(int n, int sum, long arr[]) {
        
        Arrays.sort(arr);
        
        long count = 0;
        
        for(int i=0 ; i< n-2 ; i++){
            
            int left = i+1 , right = n-1 ;
            while( left < right ){
                long s = arr[i] + arr[left] + arr[right];
                if(s < sum){
                    count+= ( right - left );
                    left++;
                }
                else{
                    right--;
                }
            }
        }
        return count;
    }
}
