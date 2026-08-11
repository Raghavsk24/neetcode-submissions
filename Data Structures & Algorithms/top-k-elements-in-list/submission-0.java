class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // Initialize an empty HashMap
        Map<Integer, Integer> map = new HashMap<>();

        // Loop through each value in the array
        for (int i = 0; i < nums.length; i++) {
            // Check if the map contains the current value
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            } else {
                map.put(nums[i], map.get(nums[i]) + 1);
            }
        }

        // Initialize an array of size k to return
        int[] toReturn = new int[k];

        // Initialize helper variables to filter through the map's key set
        int index = 0;
        Set<Integer> keySet = map.keySet();

        // Append the keys with the largest frequency onto the array
        while (index < k) {
            int max = 0;
            for (int key : keySet) {
                if (map.get(key) > max) {
                    max = key;
                }
            }
            toReturn[index] = max;
            keySet.remove(max);
            index++;
        }
        return toReturn;
    }
}
