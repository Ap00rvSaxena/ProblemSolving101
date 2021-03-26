package kickstart.RoundG;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class c {
    public static Scanner scanner;
    public static void main(String[] args){
        scanner = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int T = scanner.nextInt();
        for(int j=1; j<=T; j++){
            int w = scanner.nextInt();
            int n = scanner.nextInt();
            int[] arr = new int[w];
            for (int i=0; i<w; i++){
                arr[i] = scanner.nextInt();
            }
            //long start = System.currentTimeMillis();

            System.out.print("Case #"+ j +": ");
            testcase(w, n, arr);

            //long end = System.currentTimeMillis();
            //NumberFormat formatter = new DecimalFormat("#0.00000");
            //System.out.println("Execution time is " + formatter.format((end - start) / 1000d) + " seconds");
        }
    }

    public static void testcase(int w, int n, int[] arr) {
        long min = Long.MAX_VALUE;
        for (int t=0; t<w; t++){
            long count = 0;
            int i = arr[t];
            for (int j=0; j<w; j++){
                long abs = Math.abs(i-arr[j]);
                count += Math.min( abs, n-abs);
                if (count > min)
                    break;
            }
            min = Math.min(min, count);
        }
        System.out.print(min +"\n");
    }
}
