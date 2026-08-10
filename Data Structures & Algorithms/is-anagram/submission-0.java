class Solution {
    public boolean isAnagram(String s, String t) {
        // Check if both Strings are equivalent in length
        if (s.length() != t.length()) {
            return false;
        }

        // Initialize two empty HashMaps
        Map<Character, Integer> map_s = new HashMap<>();
        Map<Character, Integer> map_t = new HashMap<>();

        // Loop through all letters in both Strings
        for (int i = 0; i < s.length(); i++) {
            // Add each unique letter and its frequency to the Hashmaps
            map_s.put(s.charAt(i), map_s.getOrDefault(s.charAt(i), 0) + 1);
            map_t.put(t.charAt(i), map_t.getOrDefault(t.charAt(i), 0) + 1);
        }

        // Check if the HashMaps are equivalent
        return map_s.equals(map_t);
    }
}
