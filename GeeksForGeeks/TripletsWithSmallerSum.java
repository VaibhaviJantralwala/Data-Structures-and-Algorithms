class Solution {
    int countTriplets(int sum, int arr[]) {
        // code here
        
        // sort the array 
        Arrays.sort(arr);
        
        int ans = 0;
        
        for(int i=0 ; i<arr.length-2 ; i++){
            int left = i+1,right = arr.length-1;
            
            while( left < right ){
                int currSum = arr[i] + arr[left] + arr[right];
                if( currSum >= sum ){
                    right--;
                }else{
                    ans = ans + ( right - left );
                    left++;
                }
            }
        }
        return ans;
    }
}
