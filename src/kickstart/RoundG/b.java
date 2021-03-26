package kickstart.RoundG;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class b {
    public static Scanner scanner;
    public static void main(String[] args){
        scanner = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int T = scanner.nextInt();
        for(int test=1; test<=T; test++){
            int n = scanner.nextInt();
            int[][] arr = new int[n][n];
            for (int i=0; i<n; i++){
                for (int j=0; j<n; j++){
                    arr[i][j] = scanner.nextInt();
                }
            }
            //long start = System.currentTimeMillis();

            System.out.print("Case #"+ test +": ");
            testcase(n, arr);

            //long end = System.currentTimeMillis();
            //NumberFormat formatter = new DecimalFormat("#0.00000");
            //System.out.println("Execution time is " + formatter.format((end - start) / 1000d) + " seconds");
        }
    }

    public static void testcase(int n, int[][] arr) {
        long max = Long.MIN_VALUE;
        for (int k=0; k<n; k++){
            int i = 0;
            int j = k;
            long sum = 0;
            while (i<n && j<n){
                sum += arr[i][j]*1L;
                i++;
                j++;
            }
            max = Math.max(max, sum);
            //System.out.println(sum);
        }

        for (int k=1; k<n; k++){
            int i = k;
            int j = 0;
            long sum = 0;
            while (i<n && j<n){
                sum += arr[i][j]*1L;
                i++;
                j++;
            }
            max = Math.max(max, sum);
            //System.out.println(sum);
        }

        System.out.print(max + "\n");
    }
}
/*
2
3
1 2 5
3 6 1
12 2 7
5
0 0 0 0 0
1 1 1 1 0
2 2 2 8 0
1 1 1 0 0
0 0 0 0 0

1000000000
 */