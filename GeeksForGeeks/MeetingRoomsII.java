class Solution {
    public int minMeetingRooms(int[] start, int[] end) {
        // code here
        
        Arrays.sort(start);
        
        Arrays.sort(end);
        
        int room = 0, i=0 , j=0 , result = 0;
        
        while( i < start.length ){
            
            if( start[i] < end[j]){
                room++;
                result = Math.max(result,room);
                i++;
            }
            else{
                j++;
                room--;
            }
        }
        return result;
    }
}
