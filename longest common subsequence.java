class Solution {
    public int longestCommonSubsequence(String T1, String T2) {

        int n1 = T1.length();
        int n2 = T2.length();

        int[][] dp = new int[n1 + 1][n2 + 1];

        for (int i=1;i<=n1;i++){
            for (int j=1;j<=n2;j++){

                if (T1.charAt(i - 1) == T2.charAt(j - 1)){
                    dp[i][j] = 1+ dp[i-1][j-1];
                }else{
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[n1][n2];   
    }
}
