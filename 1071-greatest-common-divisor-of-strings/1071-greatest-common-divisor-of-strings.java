class Solution {
    public String gcdOfStrings(String str1, String str2) {

        // Check if both strings have the same repeating pattern
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }

        // Find GCD of their lengths
        int a = str1.length();
        int b = str2.length();

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        // First 'a' characters form the answer
        return str1.substring(0, a);
    }
}