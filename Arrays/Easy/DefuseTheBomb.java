class Solution {
    public int[] decrypt(int[] code, int k) {
        
        int[] result = new int[code.length];

        if( k == 0 ){
            for(int i=0 ; i<result.length ; i++){
                result[i] = 0;
            }
            return result;
        }

        int n = code.length;

        if( k > 0 ){

            int low = 1 , high = k , sum = 0;

            for(int i=low ; i<=high ; i++ ){
                sum += code[i % n];
            }   
            result[0] = sum;

            for( int i=1 ; i<n ; i++){
                sum -= code[low];
                low = (low+1) % n;

                high = (high+1) % n;
                sum += code[high];

                result[i] = sum;
                    
            }

            return result;
        }

        if( k < 0 ){

            int low = n - Math.abs(k) , high = n-1 , sum = 0;

            for(int i=low ; i<=high ; i++){
                sum += code[ i % n];
            }
            result[0] = sum;

            for(int i=1 ; i<n ; i++){

                sum -= code[low];
                low = (low + 1) % n;

                high = ( high + 1 ) % n;
                sum += code[high];

                result[i] = sum;
            }

            return result;
        }

        return result;
    }
}
