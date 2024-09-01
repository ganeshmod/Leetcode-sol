class Solution {
    public static int gcd(int x, int y) {
        // Euclidean algorithm for GCD
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        return x;
    }

    public String gcdOfStrings(String str1, String str2) {
        // Check if str1 and str2 concatenated in both ways are equal
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }
        // Find the GCD of the lengths of str1 and str2
        int gcdLength = gcd(str1.length(), str2.length());
        return str1.substring(0, gcdLength);
    }
}
