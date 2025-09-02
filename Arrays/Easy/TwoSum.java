class Solution {
    //O(n)
    public int[] twoSum(int[] nums, int target) {

        // return twoSumBruteForce(nums,target);
        //return twoSumBetter(nums,target);

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0 ; i<nums.length ; i++){
            int complement = target - nums[i];
            if( map.containsKey(complement) ){
                return new int[]{map.get(complement),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{};
    }

    //O(n2)
    public int[] twoSumBruteForce(int[] nums, int target) {
        for(int i=0 ; i<nums.length ; i++){
            int remaining = target - nums[i];
            for(int j=i+1 ; j<nums.length ; j++){
                if( nums[j] == remaining ){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }

    //O(n log n)
    public int[] twoSumBetter(int[] nums, int target) {
        int n = nums.length;
        int[][] arr = new int[n][2];
        for(int i=0 ; i<n ; i++){
            arr[i][0] = nums[i];
            arr[i][1] = i;
        }
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
        int left = 0 , right = n-1;
        while( left < right ){
            int sum = arr[left][0] + arr[right][0];
            if( sum == target ){
                return new int[]{arr[left][1],arr[right][1]};
            }else if( sum < target ){
                left++;
            }else{
                right--;
            }
        }
        return new int[]{};   
    }
}
