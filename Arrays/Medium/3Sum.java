class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
         // using AL to store results
        List<List<Integer>> result = new ArrayList<>();

        if( nums == null || nums.length < 3 ) return result;

        // sort the array
        Arrays.sort(nums);

        for( int i=0 ; i<nums.length-2 ; i++){
            if( i > 0 && nums[i] == nums[i-1] ) continue;
            int left = i+1 , right = nums.length-1;
            while( left < right ){
                int sum = nums[left] + nums[right];
                if( sum == -nums[i] ){
                    result.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    left++;
                    right--;

                    while( left < right && nums[left]==nums[left-1] ) left++;
                    while( left < right && nums[right]==nums[right+1] ) right--;
                }
                else if( sum > -nums[i] ){
                    right--;
                }
                else{
                    left++;
                }
            }
        }
        return result;
    }
}
