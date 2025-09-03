class Solution {
    //O(n)
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        //return containsNearbyDuplicateBF(nums,k);

        HashSet<Integer> set = new HashSet<>();
        for(int i=0 ; i<nums.length ; i++){
           if( set.contains(nums[i])) return true;
           set.add(nums[i]);
           if(set.size() > k){
            set.remove(nums[i-k]);
           }
        }
        return false;
    }

    //O(n2)
    public boolean containsNearbyDuplicateBF(int[] nums,int k){
        for(int i=0 ; i<nums.length ; i++){
            for(int j=i+1 ; j<nums.length ; j++){
                if( (nums[i] == nums[j]) && (Math.abs(i-j) <=k) ){
                         return true;
                }
            }
        }
        return false;
    }
}
