class Solution {
    // Initialize a global value to store the delimeter
    public static final String DELIMETER = "#@%ABC";

    // Encode List of Strings to a single String
    public String encode(List<String> strs) {
        // Handle cases of an empty List
        if (strs.size() == 0) {
            return "";
        }

        // Concatenate each String in the list with the delimeter
        String toReturn = "";
        for (String str : strs) {
            toReturn += str + DELIMETER;
        }
        return toReturn;
    }

    // Decode a single String to a List of Strings
    public List<String> decode(String str) {
        // Handle cases of an empty String
        if (str.isEmpty()) {
            return new ArrayList<>();
        }

        // Split the String into an array by the delimeter
        String[] parts = str.split(DELIMETER, -1);
        
        // Return the array as a List
        List<String> toReturn = new ArrayList<>();
        for (int i = 0; i < parts.length - 1; i++) {
            toReturn.add(parts[i]);
        }
        return toReturn;
    }
}
