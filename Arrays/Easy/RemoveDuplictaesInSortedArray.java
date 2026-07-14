class Solution {
    public int removeDuplicates(int[] nums) {
       int off = 0;
       int result = off + 1;
       int cm = off + 1;

       while( cm < nums.length ){
        if( nums[cm] == nums[cm - 1] ){
            cm++;
            continue;
        }
        nums[off+1] = nums[cm];
        off++;
        result++;
        cm++;
       }
       return result;
    }
}

class Solution {
    public int removeDuplicates(int[] nums) {
        if( nums.length == 0 ) return 0;
        int i=0 ;
        for(int j=0 ; j<nums.length ; j++){
            if( nums[j] != nums[i] ){
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }
}
