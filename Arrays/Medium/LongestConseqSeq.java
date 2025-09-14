class Solution {
    public int longestConsecutive(int[] nums) {

        // In case of an empty array
        if(nums.length == 0) return 0;

        // 1. Store all numbers in a HashSet 
        //This allows us to quickly check for the existence of a number's neighbors.
        Set<Integer> map = new HashSet<>();
        for(int num : nums) {
            map.add(num);
        }

        int longestStreak = 0;

        // 2. Iterate through each number in the original array.
        for (int num : map) {

            // 3. Check if the current number could be the start of a new sequence.
            // A number 'num' is the start of a sequence if 'num - 1' is NOT
            // present in our set. If 'num - 1'exists, it means 'num' is part of 
            // a longer sequence that started earlier, and we can skip it to avoid redundant work.
            if( !map.contains(num-1) ) {
                int currNum = num;
                int currStreak = 1;

            // 4. If it's a new sequence, extend it by checking for consecutive numbers.
            // We keep incrementing 'currentNum' and checking if the next number
            // exists in our set.
            while(map.contains(currNum + 1)) {
                currNum++;
                currStreak++;
            }

            // 5. After the inner loop finishes, we have found the full length
            // of the current consecutive sequence.
            // Update our global longest streak if the current one is longer.
            longestStreak = Math.max(longestStreak , currStreak);
        }
    }
        return longestStreak;
    }
}
