class Solution {
    //O(n)
    public boolean containsDuplicate(int[] nums) {
        //return containsDuplicateBruteForce(nums);
        boolean isDuplicate = false;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0 ; i<nums.length ; i++){
            if( !map.containsKey(nums[i]) ){
                map.put(nums[i],i);
                isDuplicate = false;
            }else{
                isDuplicate = true;
                break;
            }
        }
        return isDuplicate;
    }

    //O(n2)
    public boolean containsDuplicateBruteForce(int[] nums) {
        for(int i=0 ; i<nums.length ; i++){
            for(int j=i+1 ; j<nums.length ; j++){
                if( nums[i] == nums[j] ){
                    return true;
                }
            }
        }
        return false;
    }
}
