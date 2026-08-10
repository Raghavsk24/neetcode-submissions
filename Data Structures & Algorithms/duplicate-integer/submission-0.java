class Solution {
    public boolean hasDuplicate(int[] nums) {
        // Initialize an empty set
        Set<Integer> set = new HashSet<>();

        // Loop through all values in the array
        for (int i = 0; i < nums.length; i++) {
            // Check if the value exists in the set
            if (set.contains(nums[i])) {
                return true;
            } else {
                // Add the value to the HashSet
                set.add(nums[i]);
            }
        }
        return false;
    }
}