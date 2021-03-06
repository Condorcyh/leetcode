package DynamicProgramming.Q1143;

/**
 * @Author 车一晗
 * @Date 2022/06/16
 **/
public class LCS {
    public int longestCommonSubsequence(String text1, String text2) {
        int len1 = text1.length();
        int len2 = text2.length();

        //dp[i][j]表示text1[0...i]和text2[0...j]的LCS长度
        int[][] dp = new int[len1][len2];

        dp[0][0] = text1.charAt(0) == text2.charAt(0) ? 1 : 0;
        for (int i = 1; i < len1; i++) {
            dp[i][0] = text1.charAt(i) == text2.charAt(0) ? 1 : dp[i - 1][0];
        }
        for (int j = 1; j < len2; j++) {
            dp[0][j] = text1.charAt(0) == text2.charAt(j) ? 1 : dp[0][j - 1];
        }

        for (int i = 1; i < len1; i++) {
            for (int j = 1; j < len2; j++) {
                if (text1.charAt(i) == text2.charAt(j)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[len1 - 1][len2 - 1];
    }
}
