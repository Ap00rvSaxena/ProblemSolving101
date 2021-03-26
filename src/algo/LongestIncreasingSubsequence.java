package algo;

public class LongestIncreasingSubsequence {

    public static void main(String[] args){
        //int[] a = {2, 7, 4, 3, 8};
        int[] a = {2, 4, 3, 7, 4, 5};
        System.out.println("Length is: " + longestIncSubsqs(a));
    }

    private static int longestIncSubsqs(int[] a) {
        int n = a.length;
        int[] dp = new int[n];
        for (int i=0; i<n; i++)
            dp[i] = 1;

        for (int i=1; i<n; i++){
            for (int j=0; j<i; j++){
                if (a[j] < a[i] && dp[i] < dp[j] + 1)
                    dp[i] = dp[j]+1;
            }
        }
        int max = Integer.MIN_VALUE;
        for (int i=0; i<n; i++){
            max = Math.max(max, dp[i]);
        }
        return max;
    }
}
