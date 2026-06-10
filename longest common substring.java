import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        int r = s1.length();
        int c = s2.length();

        int[][] dp = new int[r + 1][c + 1];
        int max = 0;

        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= c; j++) {

                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                    max = Math.max(max, dp[i][j]);
                } else {
                    dp[i][j] = 0;
                }
            }
        }

        System.out.println(max);
    }
}
