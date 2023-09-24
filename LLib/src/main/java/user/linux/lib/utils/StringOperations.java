package user.linux.lib.utils;

public class StringOperations {
    public static String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static boolean isPalindrome(String str) {
        return str.equals(reverse(str));
    }

    public static String concatenate(String a, String b) {
        return a + b;
    }

    public static String[] split(String str, String delimiter) {
        return str.split(delimiter);
    }

    public static int countCharacters(String str, char ch) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (c == ch) {
                count++;
            }
        }
        return count;
    }

    public static String toUpperCase(String str) {
        return str.toUpperCase();
    }

    public static String toLowerCase(String str) {
        return str.toLowerCase();
    }

    public static String replace(String str, String target, String replacement) {
        return str.replace(target, replacement);
    }

    public static int length(String str) {
        return str.length();
    }

    public static boolean containsSubstring(String str, String substring) {
        return str.contains(substring);
    }

    public static int levenshteinDistance(String a, String b) {
        int[][] dp = new int[a.length() + 1][b.length() + 1];

        for (int i = 0; i <= a.length(); i++) {
            for (int j = 0; j <= b.length(); j++) {
                if (i == 0) {
                    dp[i][j] = j;
                } else if (j == 0) {
                    dp[i][j] = i;
                } else {
                    dp[i][j] = Math.min(Math.min(dp[i - 1][j], dp[i][j - 1]), dp[i - 1][j - 1])
                            + (a.charAt(i - 1) == b.charAt(j - 1) ? 0 : 1);
                }
            }
        }
        return dp[a.length()][b.length()];
    }
}