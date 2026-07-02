class Solution {
    public int[] replaceElements(int[] arr) {

        int[] result = new int[arr.length];

        if(arr.length == 1 || arr == null){
            result[0] = -1;
            return result;
        }

        int max = Integer.MIN_VALUE;
        for(int i=0 ; i<arr.length ; i++){
            for(int j=i+1 ; j<arr.length ; j++){
                if(arr[j] > max){
                    max = arr[j];
                }
                result[i] = max;
            }
            max = 0;
            if(i == arr.length-1){
                    result[i] = -1;
            }
        }
        return result;
    }
}
