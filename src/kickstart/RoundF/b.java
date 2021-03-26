package kickstart.RoundF;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class b {
    public static Scanner scanner;
    public static void main(String[] args){
        scanner = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int T = scanner.nextInt();
        for(int j=1; j<=T; j++){
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int[][] arr = new int[n][2];
            for(int i=0; i<n; i++){
                arr[i][0] = scanner.nextInt();
                arr[i][1] = scanner.nextInt();
            }

            //long start = System.currentTimeMillis();

            System.out.print("Case #"+ j +": ");
            testcase(n, k, arr);

            //long end = System.currentTimeMillis();
            //NumberFormat formatter = new DecimalFormat("#0.00000");
            //System.out.println("Execution time is " + formatter.format((end - start) / 1000d) + " seconds");
        }
    }

    public static void testcase(int n, int k, int[][] arr) {
        int count = 0;
        Arrays.sort(arr, (a,b) -> a[0] - b[0]);
        int last = 0;
        for (int i=0; i<n; i++){
            if (last > arr[i][1])
                continue;
            arr[i][0]= Math.max(last, arr[i][0]);
            int temp = (arr[i][1] - arr[i][0] + k -1)/k;
            last = arr[i][0] + temp*k;
            count+=temp;
        }
        System.out.print(count + "\n");
    }
}
/*
9
3 5
1 5
10 11
8 9
3 2
1 2
3 5
13 14
5 3
1 2
3 5
8 9
10 11
12 15
4 6
1 4
5 6
7 8
9 12
4 6
1 4
5 6
7 8
9 13
4 6
1 4
5 6
7 8
9 14
4 5
1 4
5 6
7 8
9 14
4 6
1 4
5 6
7 8
9 12
4 2
1 5
7 12
13 14
15 18

Case #1: 2
Case #2: 3
Case #3: 4
Case #4: 2
Case #5: 2
Case #6: 3
Case #7: 3
Case #8: 2
Case #9: 8
 */