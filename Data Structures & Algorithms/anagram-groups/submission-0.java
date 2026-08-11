class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Initialize an empty list to return
        List<List<String>> toReturn = new ArrayList<>();

        // Initialize an empty set
        Set<String> anagramsAdded = new HashSet<>();

        // Loop through each word in the array
        for (int i = 0; i < strs.length; i++) {
            // Check if the curret String is in the set
            if (anagramsAdded.contains(strs[i])) {
                continue;
            }

            // Initialize an empty to store equivalent anagrams
            List<String> anagrams = new ArrayList<>();

            // Sort letters in strs[i]
            char[] i_array = strs[i].toCharArray();
            Arrays.sort(i_array);
            String sorted_i = new String(i_array);

            // Loop through each remaining word in the array
            for (int j = i; j < strs.length; j++) {
                // Sort letters in strs[j]
                char[] j_array = strs[j].toCharArray();
                Arrays.sort(j_array);
                String sorted_j = new String(j_array);

                // Check if the sorted strings are equivalent
                if (sorted_i.equals(sorted_j)) {
                    anagrams.add(strs[j]);
                    anagramsAdded.add(strs[j]);
                }
            }
            toReturn.add(anagrams);
        }
        return toReturn;
    }
}
