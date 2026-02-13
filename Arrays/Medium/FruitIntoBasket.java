class Solution {
    public int totalFruit(int[] fruits) {

        // int n = fruits.length;
        // int high = 0 , left = 0;
        // int res = 0;

        // Map<Integer,Integer> map = new HashMap<>();

        // for(high = 0 ; high < n ; high++){
        //     int frt = fruits[high];
        //     map.put(frt , map.getOrDefault( frt , 0 ) + 1);

        //     while( map.size() > 2 ){
        //         int leftFrt = fruits[left];
        //         map.put(leftFrt , map.get(leftFrt) - 1);

        //         if( map.get(leftFrt) == 0 ){
        //         map.remove(leftFrt);
        //         }
        //         left++;
        //     }
        //     res = Math.max( res , high - left + 1);
        // }
        // return res;

        int lastFruit = -1;
        int secLastFruit = -1;
        int lastFruitCount = 0;
        int currMax = 0;
        int max = 0;

        for( int frt : fruits) {

            if( frt == lastFruit || frt == secLastFruit ){
                currMax++;
            }else{
                currMax = lastFruitCount + 1;
            }

            if( frt == lastFruit ){
                lastFruitCount++;
            }else{
                lastFruitCount = 1;
                secLastFruit = lastFruit;
                lastFruit = frt;
            }

            max = Math.max( max , currMax );
        }
        return max;
    }
}
