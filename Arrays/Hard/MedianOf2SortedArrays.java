class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
       int[] resultArray = mergeArrays(nums1,nums2);
       int n = resultArray.length;
       if( n%2 == 0 ){ // even length merged array
          int middle1 = resultArray[n/2] ;
          int middle2 = resultArray[n/2 -1] ;
          return (double) (middle1 + middle2)/2;
       }else{ // odd length merged array
          return (double) resultArray[n/2];
       }
    }

    private int[] mergeArrays(int[]nums1,int[] nums2) {
        //lengths of 2 input sorted arrays
        int m = nums1.length;
        int n = nums2.length;

        //new array of size n+m
        int[] merge = new int[n + m];

        int i= 0 ; //pointer for nums1 array
        int j = 0; //pointer for nums2 array
        int k = 0; ////pointer for merge array

        //loop until one of the arrays is fully processed
        while( i < m && j < n ) {
            if( nums1[i] < nums2[j] ) {
                merge[k] = nums1[i];
                i++;
            }else{
                merge[k] = nums2[j];
                j++;
            }
            k++;
        }

        //copy remaining elements from num1
        while( i < m ){
            merge[k] = nums1[i];
            i++;
            k++;
        }
        //copy remaining elements from num2
        while( j < n ){
            merge[k] = nums2[j];
            j++;
            k++;
        }
        return merge; 
    }
}
