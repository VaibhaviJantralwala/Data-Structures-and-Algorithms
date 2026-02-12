class Solution {
    public int totalFruit(int[] fruits) {
        int n = fruits.length;
        int high = 0 , left = 0;
        int res = 0;

        Map<Integer,Integer> map = new HashMap<>();

        for(high = 0 ; high < n ; high++){
            int frt = fruits[high];
            map.put(frt , map.getOrDefault( frt , 0 ) + 1);

            while( map.size() > 2 ){
                int leftFrt = fruits[left];
                map.put(leftFrt , map.get(leftFrt) - 1);

                if( map.get(leftFrt) == 0 ){
                map.remove(leftFrt);
                }
                left++;
            }
            res = Math.max( res , high - left + 1);
        }
        return res;
    }
}
================================================================================

class Solution {
    public int totalFruit(int[] fruits) {

        //sliding window
        int left=0;
        int len=fruits.length;
        int ans =0;

        //since fruits[i] can be only 1 less than the length i can have an array of size len
        //to keep a track whether i have collected that fruit or not
        int[] map = new int[len];

        //this holds the no fruits i have seen till now if it exceeds 2
        //then its invalid
        int count =0;

        for(int right=0; right<len; right++)
        {

            //is it the first time i see this fruit
            if(map[fruits[right]]==0)
            {
                //increment the map to denote that this fruit is seen
                map[fruits[right]]++;
                
                count++;
            }
            else
            {   //just increment its position
                map[fruits[right]]++;
            }

            

            while(count>2) //invalid
            {
                map[fruits[left]]--;
                if(map[fruits[left]] == 0)
                {
                    //decrement the counter
                    count--;
                }
                left++;
            }

            //valid
            ans = Math.max(ans, right-left+1);

        }

        return ans;

        
    }
}
