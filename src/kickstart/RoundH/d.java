package kickstart.RoundH;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class d {
    public static Scanner scanner;
    public static void main(String[] args){
        scanner = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int T = scanner.nextInt();
        for(int j=1; j<=T; j++){
            int n = scanner.nextInt();
            int[] arr = new int[n];
            long totalSum = 0;
            for (int i=0; i<n; i++){
                arr[i] = scanner.nextInt();
                totalSum += arr[i];
            }
            //long start = System.currentTimeMillis();

            System.out.print("Case #"+ j +": ");
            testcase(n, arr, totalSum);

            //long end = System.currentTimeMillis();
            //NumberFormat formatter = new DecimalFormat("#0.00000");
            //System.out.println("Execution time is " + formatter.format((end - start) / 1000d) + " seconds");
        }
    }

    public static void testcase(int n, int[] arr, long totalSum) {
        double total = 0;
        double ways = n-1;
        for (int i=0; i<n; i++){
            long sum = 0;
        }
        System.out.print(total/ways +"\n");
    }
}
