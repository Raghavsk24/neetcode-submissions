class Solution {
    public boolean isPalindrome(String s) {
        // Clean the String to lowercase alphanumeric characters only
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        System.out.println(s);

        // Initialize pointers to track start & end index
        int start = 0;
        int end = s.length() - 1;

        // Compare each character at start to end in the String
        while (start < end) {
            // Reject instances where characters at both pointers don't match
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
