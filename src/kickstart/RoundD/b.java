package kickstart.RoundD;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.List;
import java.util.Scanner;

public class b {
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
        if (n < 5){
            System.out.print(count + "\n");
            return;
        }
        int notes = 4;
        int sucGreater = 0;
        int sucSmaller = 0;
        for (int i=1; i<n; i++){
            if (a[i-1] < a[i]){
                sucGreater++;
                sucSmaller = 0;
            }
            else if (a[i-1] > a[i]){
                sucSmaller++;
                sucGreater = 0;
            }
            else if (a[i-1] == a[i])
                continue;
            if (sucGreater >= 4 || sucSmaller >= 4){
                count++;
                sucGreater = 0;
                sucSmaller = 0;
            }
        }
        System.out.print(count + "\n");
    }
}
