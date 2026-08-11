class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Initialize an empty HashMap
        Map<String, List<String>> map = new HashMap<>();

        // Loop through all words in the array
        for (int i = 0; i < strs.length; i++) {
            // Sort the letters in each word
            char[] wordArray = strs[i].toCharArray();
            Arrays.sort(wordArray);
            String word = new String(wordArray);

            // Check if the word is in the map
            if (!map.containsKey(word)) {
                map.put(word, new ArrayList<String>(List.of(strs[i])));
            } else {
                // Add the unsorted word to the list at that key
                map.get(word).add(strs[i]);
            }
        }
        return new ArrayList<>(map.values());
    }
}
