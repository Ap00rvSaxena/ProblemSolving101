package codechef;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class GDSUB {
    final static int mod = 1000000007;

    static void printArr(long[][] arr){
        int n = 5;//arr.length;
        int m = 5;//arr[0].length;
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j] +", ");
            }
            System.out.println();
        }
    }

    public static double productOfSum(List<Integer> list, int k) {
        int n = list.size();
        long dp[][] = new long[1010][1010];
        long[] val = new long[1010];
        for (int i=0, j=1; i<list.size(); i++, j++){
            dp[1][j] = (dp[1][j-1] + list.get(i)) % mod;
            val[j] = list.get(i);
        }
        System.out.println("Array: " + Arrays.toString(val));
        printArr(dp);
        k = Math.min(k,n);
        long ans = 1;
        for(int i=2;i<=n;i++)
        {
            for(int j=i;j<=n;j++){
                dp[i][j] = (dp[i-1][j-1] * val[j]) % mod ;
                dp[i][j] = (dp[i][j] + dp[i][j-1]) % mod;
            }
        }
        System.out.println("After Op: ");
        printArr(dp);
        for (int i=0; i<=k; i++){
            ans = (ans + dp[i][n]) % mod;
        }
        return ans;
    }

    public static void main(String arg[]){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int[] freq = new int[8001];
        int dist = 0;
        for (int i = 0; i < n; i++) {
            freq[arr[i]] += 1;
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 8001; i++) {
            if (freq[i] != 0){
                list.add(freq[i]);
                dist++;
            }
        }
        //System.out.println("Freq Array: " + Arrays.toString(freq));
        //System.out.println("No of Dist: " + dist);
        System.out.println((int)productOfSum(list, k));
    }
}
/*
5 3
2 2 3 3 5
4 2
1 2 3 4
 */