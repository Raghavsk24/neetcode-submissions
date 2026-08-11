class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // Initialize Data Structures: Hash Map, Array and Set
        Map<Integer, Integer> map = new HashMap<>();
        int[] toReturn = new int[k];
        Set<Integer> keySet = map.keySet();

        // Add each value and its frequency as a key-value pair to the Hash Map
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);   
        }

        // Find the values in the HashMap with the k highest frequencies
        for (int i = 0; i < toReturn.length; i++) {
            int[] temp = new int[2];
            
            // Add the max key-value pair to the temp array
            for (int key : keySet) {
                if (map.get(key) > temp[1]) {
                    temp[0] = key;
                    temp[1] = map.get(key);
                }
            }

            // Add the key to the toReturn and remove the key from the keySet
            toReturn[i] = temp[0];
            keySet.remove(temp[0]);

        }
        return toReturn;
    }
}
