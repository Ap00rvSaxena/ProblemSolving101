package kickstart.RoundD;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Solution {
    public static Scanner scanner;
    public static void main(String[] args){
        scanner = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int T = scanner.nextInt();
        for(int j=1; j<=T; j++){
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for (int i=0; i<n; i++)
                arr[i] = scanner.nextInt();

            long start = System.currentTimeMillis();

            System.out.print("Case #"+ j +": ");
            testcase(n, arr);

            //long end = System.currentTimeMillis();
            //NumberFormat formatter = new DecimalFormat("#0.00000");
            //System.out.println("Execution time is " + formatter.format((end - start) / 1000d) + " seconds");
        }
    }

    public static void testcase(int n, int[] a) {
        int count = 0;
        int maxSofar = Integer.MIN_VALUE;
        for (int i=0; i<n; i++){
            boolean cond1 = true;
            boolean cond2 = true;
            if (maxSofar >= a[i]){
                cond1 = false;
            }
            maxSofar = Math.max(maxSofar, a[i]);
            if (i != n-1 && a[(i+1)] >= a[i])
                cond2 = false;
            if (cond1 && cond2)
                count++;
        }
        System.out.print(count + "\n");
    }
}
/*
4
2 3
-2 -3
3 0
-1 1

1
3 0
 */