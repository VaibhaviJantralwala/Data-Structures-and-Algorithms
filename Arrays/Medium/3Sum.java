class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if( nums == null || nums.length < 3 ) return new ArrayList<>();

        //Sort the array 
        Arrays.sort(nums);
        
        //make a HashSet to store Unique pairs
        List<List<Integer>> result = new ArrayList<>();

        //Fix 1st element while finding other 2 elements
        for(int i=0 ; i<nums.length-2 ; i++){

            //skip the duplicates
            if( i > 0 && nums[i] == nums[i-1]) continue;

            //finding other 2 elements using 2Sum approach
            int left = i+1 , right = nums.length-1 , sum = ( -1 ) * nums[i];

            while( left < right ){
                int s = nums[left] + nums[right];

                if( s == sum ){
                    //Add to set and move to find other triplets
                    result.add(Arrays.asList( nums[i] , nums[left] , nums[right] ));

                    //skip duplicates for left
                    while( left < right && nums[left] == nums[left+1]) left++;
                    //skip duplicates for right
                    while( left < right && nums[right] == nums[right-1]) right--;

                    left++;
                    right--;
                }

                else if( s < sum ){
                    left++;
                }

                else right--;
            }
        }
        return result;
    }
}
