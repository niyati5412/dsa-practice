class Solution {
    public int lengthOfLongestSubstring(String s) {

        int i = 0, j = 0, ans = 0;

        HashSet<Character> set = new HashSet<>();

        while (j < s.length()) {

            char ch = s.charAt(j);

            if (!set.contains(ch)) {
                ans = Math.max(ans, j - i + 1);
                set.add(ch);
                j++;
            } else {
                set.remove(s.charAt(i));
                i++;
            }
        }

        return ans;
    }
}