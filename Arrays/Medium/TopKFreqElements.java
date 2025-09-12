class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int x = nums.length;

        if( k == x ) return nums;

        // Step 1: Count the frequency of each number using a HashMap.
        Map<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            map.put( num , map.getOrDefault(num,0)+1); /*freqMap.getOrDefault(num, 0): It checks if num already exists in our freqMap. 
                                                        If it does, it gets its current count. If it doesn't (it's the first time we've seen this number), it returns 0.
                                                        else , ... + 1: We add 1 to the count.
                                                        freqMap.put(num, ...): We then store this new, updated count back in the map.*/
        }

        // Step 2: Use a Min-Heap (PriorityQueue) to find the k most frequent elements.
        // We'll store the numbers in the heap and sort them based on their frequencies.
        Queue<Integer> heap = new PriorityQueue<>(
            (a,b) -> map.get(a) - map.get(b) );   
      /*This is a lambda expression, a short way of writing a function. It takes two numbers (n1, n2) from the heap and returns a value to tell the heap which one should be prioritized.
      freqMap.get(n1) - freqMap.get(n2): 
      This is the sorting logic. It gets the frequency of n1 and the frequency of n2 from our freqMap and subtracts them.
      If the result is negative, it means n1's frequency is smaller. The heap puts n1 on top. This makes it a Min-Heap based on frequency.
      If the result is positive, n2's frequency is smaller. n2 goes on top.
      If the result is zero, their frequencies are equal.*/

        // Step 3: Iterate through the numbers (keys) in the frequency map.
        for(int n: map.keySet()) {
            heap.add(n);
            // If the heap size exceeds k, remove the least frequent element.
            if (heap.size() > k) {
                heap.poll();
            }
        }

        // Step 4: Extract the elements from the heap and put them in a result array.
        int[] result = new int[k];
        for (int i = k - 1; i >= 0; i--) {
            result[i] = heap.poll();
        }

        return result;
    }
}
