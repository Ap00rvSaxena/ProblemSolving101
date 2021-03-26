package kickstart.RoundF;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class a {
    public static Scanner scanner;
    public static void main(String[] args){
        scanner = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int T = scanner.nextInt();
        for(int j=1; j<=T; j++){
            int n = scanner.nextInt();
            int x = scanner.nextInt();
            int[] arr = new int[n];
            for (int i=0; i<n; i++)
                arr[i] = scanner.nextInt();

            //long start = System.currentTimeMillis();

            System.out.print("Case #"+ j +": ");
            testcase(n, x, arr);

            //long end = System.currentTimeMillis();
            //NumberFormat formatter = new DecimalFormat("#0.00000");
            //System.out.println("Execution time is " + formatter.format((end - start) / 1000d) + " seconds");
        }
    }

    public static void testcase(int n, int x, int[] a) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((y,b) -> y[1]- b[1] == 0 ? y[0]-b[0] : y[1]- b[1]);
        for (int i=0; i<n; i++){
            int idx = a[i]/x + (a[i]%x == 0 ? 0 : 1);
            idx--;
            pq.add(new int[]{i+1, idx});
        }

        while(!pq.isEmpty()){
            int[] i = pq.remove();
                System.out.print(i[0] + " ");
        }
        System.out.println();
    }
}
