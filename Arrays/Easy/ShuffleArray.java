class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[2*n];

        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        for(int i=0 ; i<n ; i++){
            arr1[i] = nums[i];
        }

        int index = n;
        for(int i=0 ; i<n ; i++){
            arr2[i] = nums[index];
            index++;
        }

        int i = 0;
        int j = 0; 

        for( int k=0 ; k<nums.length ; k++){
            if(k%2 == 0){
                result[k] = arr1[i];
                i++;
            }else{
                result[k] = arr2[j];
                j++;
            }
        }

        return result;
    }
}
