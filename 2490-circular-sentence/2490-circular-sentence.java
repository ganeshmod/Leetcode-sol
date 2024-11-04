class Solution {
    public boolean isCircularSentence(String s) {
        int length = s.length();

        // Check if the first and last characters of the sentence are the same
        if (s.charAt(0) != s.charAt(length - 1)) {
            return false;
        }

        // Check each word boundary
        for (int i = 0; i < length; i++) {
            if (s.charAt(i) == ' ') {
                // Ensure the last character of the previous word matches the first character of the next word
                if (s.charAt(i - 1) != s.charAt(i + 1)) {
                    return false;
                }
            }
        }

        return true;
    }
}
