class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        for(int i=0 ; i<nums.length ; i++){
            if( nums[i] != val ){  //skips the val if current element is same as val 
                nums[k] = nums[i]; // shifts the elements except val 
                k++;
            }
        }
        return k;
    }
}
