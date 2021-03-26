package kickstart.RoundE;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class a {
    public static Scanner scanner;
    public static void main(String[] args){
        scanner = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int T = scanner.nextInt();
        for(int j=1; j<=T; j++){
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for (int i=0; i<n; i++)
                arr[i] = scanner.nextInt();

            //long start = System.currentTimeMillis();

            System.out.print("Case #"+ j +": ");
            testcase(n, arr);

            //long end = System.currentTimeMillis();
            //NumberFormat formatter = new DecimalFormat("#0.00000");
            //System.out.println("Execution time is " + formatter.format((end - start) / 1000d) + " seconds");
        }
    }

    public static void testcase(int n, int[] a) {
        int count = 0;
        int len = 1, d = 0;
        for (int i=1; i<n; i++){
            int curr = a[i] - a[i-1];
            if (curr != d){
                d = curr;
                len = 2;
            }
            else {
                len++;
            }
            count = Math.max(count, len);
        }
        System.out.print(count + "\n");
    }
}
