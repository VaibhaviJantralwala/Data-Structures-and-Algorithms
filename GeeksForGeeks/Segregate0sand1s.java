// User function Template for Java

class Solution {
    void segregate0and1(int[] arr) {
        // code here
        int i=0 ;
        int j = arr.length - 1;
        int temp;
        while( i < j ){
            if( arr[i] == 0 ){
                i++; 
            }else if(arr[j] == 1 ){
                j--;
            }else{
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
    }
}
