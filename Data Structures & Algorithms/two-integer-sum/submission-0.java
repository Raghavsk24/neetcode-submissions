class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Initialize an empty HashMap
        Map<Integer, Integer> map = new HashMap<>();

        // Loop through all values in the array
        for (int i = 0; i < nums.length; i++) {
            // Calculate the complement
            int complement = target - nums[i];

            // Check if the complement exists in the HashMap
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            } else {
                map.put(nums[i], i);
            }
        } 
        return new int[2];   
    }
}
