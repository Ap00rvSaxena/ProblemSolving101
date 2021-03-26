package algo;

import java.util.Arrays;

public class LongestPalindromicSubstring {
    public static void main(String[] args){
        String str = "forgeeksskeegfor";
        String str1 = "agekegc";
        System.out.println("Length is: " + longestPalSubstr(str1));
    }

    private static String longestPalSubstr(String str) {
        int n = str.length();
        char[] a = str.toCharArray();
        int start=0, len=1;
        int[][] dp = new int[n][n];
        for (int i=0; i<n; i++)
            dp[i][i] = 1;

        for(int i=0; i<n-1; i++){
            if (a[i] == a[i+1]){
                dp[i][i+1] = 1;
                start = i;
                len = 2;
            }
        }

        for(int k=3; k<=n; k++){
            for(int i=0; i<n-k+1; i++){
                int j = i+k -1;
                if (dp[i+1][j-1] == 1 && a[i] == a[j]){
                    dp[i][j] = 1;
                    if (k > len){
                        start = i;
                        len = k;
                    }
                }
            }
        }
        for (int[] x : dp)
            System.out.println(Arrays.toString(x));
        return str.substring(start, start + len);
    }
}
