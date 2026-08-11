class Solution {

    // Encode List of Strings to a single String
    public String encode(List<String> strs) {
        // Handle cases of an empty List
        if (strs.size() == 0) {
            return "";
        }
        
        // Initialize a delimter to separate Strings
        String delimeter = "&$#@2y8";

        // Loop through each String and the list and append them
        String toReturn = "";
        for (String str : strs) {
            toReturn = toReturn + str + delimeter;
        }
        return toReturn;
    }

    // Decode a single String to a List of Strings
    public List<String> decode(String str) {
        // Handle cases of an empty String
        if (str.length() == 0) {
            return new ArrayList<String>();
        }

        // Initialize a delimter to separate the String into parts
        String delimeter = "&$#@2y8";

        // Split the String into an array by the delimeter
        String[] parts = str.split(delimeter);
        
        // Return the array as a List
        return new ArrayList<String>(Arrays.asList(parts));
    }
}
