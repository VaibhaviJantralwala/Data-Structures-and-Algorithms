class Solution {
    public int trap(int[] height) {
        //return trapwater(height);

        if( height == null || height.length < 3 ){
            return 0;
        }
        int left = 0 , right = height.length - 1;
        int leftmax = 0;
        int rightmax = 0;
        int trapwater = 0;
        int maxwater = 0;
        while( left < right ){
            if( height[left] <= height[right] ) {
                //moving from left side
                //check for maximum value on left side
                if( height[left] >= leftmax ){
                    leftmax = height[left];
                }else{ //water is trapped here
                    trapwater += leftmax - height[left];
                }
                left++;
            }
            else{
                //right < left case . move frm right to left
                //check for max value on right side
                if( height[right] >= rightmax ){
                    rightmax = height[right];
                }else{ //water is trapped here
                    trapwater += rightmax - height[right];
                }
                right--;
            }
        }
        return trapwater;
    }

    //using extra arrays
    public int trapwater(int[] height) {
        int n = height.length;
        //leftmax array
        int leftmax[] = new int[n];
        leftmax[0] = height[0];
        for(int i=1 ; i<n ; i++){
            leftmax[i] = Math.max(height[i],leftmax[i-1]);
        }
        //rightmax array
        int rightmax[] = new int[n];
        rightmax[n-1] = height[n-1];
        for(int i=n-2 ; i>=0 ; i--){
            rightmax[i] = Math.max(height[i],rightmax[i+1]);
        }
        //loop
        int TrappedWater = 0;
        for(int i=0 ; i<n ; i++){
            //waterlevel = min(leftmax,rightmax)
            int WaterLevel = Math.min(leftmax[i],rightmax[i]);
            //trapped water = waterlevel - height
            TrappedWater += WaterLevel - height[i];
        }
        return TrappedWater;
    }
}
