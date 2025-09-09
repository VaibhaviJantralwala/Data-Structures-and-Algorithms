class Solution {
    public int maxArea(int[] height) {
        //return maxAreaBruteForce(height);

        int area = 0 , max = Integer.MIN_VALUE;
        int left = 0 , right = height.length-1;
        while(left < right) {
            area = Math.min( height[left] , height[right] ) * (right - left);
            max = Math.max( area , max );
            if( height[left] < height[right] ) {
                left++;
            }else{
                right--;
            }
        }
        return max;
    }

    //O(n2)
    public int maxAreaBruteForce(int[] height) {
        int area = 0;
        int max = Integer.MIN_VALUE;
        for(int i=0 ; i<height.length ; i++) {
            for(int j=i+1 ; j<height.length ; j++) {
                area = Math.min( height[i] , height[j] ) * (j-i);
                if( area > max ) max = area;
            }
        }
        return max;
    }
}
