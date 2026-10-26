// class Solution {
//     public int solve(String text1, int i, String text2, int j, int dp[][]) {
//         if (i < 0 || j < 0) return 0;
//         if (dp[i][j] != -1) return dp[i][j];
//         if (text1.charAt(i) == text2.charAt(j)) {
//             return dp[i][j] = 1 + solve(text1, i - 1, text2, j - 1, dp);
//         }
//         return dp[i][j] = Math.max(solve(text1, i - 1, text2, j, dp), solve(text1, i, text2, j - 1, dp));
//     }

//     public int longestCommonSubsequence(String text1, String text2) {
//         int n1 = text1.length(), n2 = text2.length();
//         int dp[][] = new int[n1][n2];
//         for (int i = 0; i < n1; i++) {
//             Arrays.fill(dp[i], -1);
//         }
//         return solve(text1, n1 - 1, text2, n2 - 1, dp);
//     }
// }

class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int n1 = text1.length();
        int n2 = text2.length();
        int dp[][] = new int[n1 + 1][n2 + 1];

        for (int i = 1; i <= n1; i++) {
            for (int j = 1; j <= n2; j++) {
                if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        return dp[n1][n2];
    }
}