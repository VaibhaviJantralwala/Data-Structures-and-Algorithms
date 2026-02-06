class Solution {
    public int threeSumClosest(int[] nums, int target) {

        //Sort the array
        Arrays.sort(nums);

        // to track minimum absolute difference
        int minDifference = Integer.MAX_VALUE;
        
        int resSum = nums[0] + nums[1] + nums[2];

        // 3sum logic ( without dupicates )
        for(int i=0 ; i< nums.length-2 ; i++){
            int left = i+1 , right = nums.length-1;
            while(left < right){
                int sum = nums[i] + nums[left] + nums[right];
                if(sum == target){
                    return target;
                }
                else if(sum < target){
                    left++;
                }else{
                    right--;
                }

                // MAIN PART HERE ---
                int diffToTarget = Math.abs(sum-target);  // CALULATING DIFFERENCE
                if(diffToTarget < minDifference){         
                    resSum = sum;                         // UPDATE THE RESULT SUM WITH THE SUM THAT HAS LESS DIFFERENCE WITH TARGET
                    minDifference = diffToTarget;         // UPDATING DIFFERENCE
                }

            }
        }
        return resSum; 
    }
}
