package hackercup;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

class a {
    public static Scanner scanner;
    public static void main(String[] args){
        scanner = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int T = scanner.nextInt();
        for(int j=1; j<=T; j++){
            int n = scanner.nextInt();
            String in = scanner.next();

            String out = scanner.next();

            long start = System.currentTimeMillis();

            System.out.print("Case #"+ j +": \n");
            testcase(n, in.toCharArray(), out.toCharArray());

            //long end = System.currentTimeMillis();
            //NumberFormat formatter = new DecimalFormat("#0.00000");
            //System.out.println("Execution time is " + formatter.format((end - start) / 1000d) + " seconds");
        }
    }

    public static void testcase(int n, char[] in, char[] out) {
        char[][] res = new char[n][n];
        for (int i=0; i<n; i++){
            boolean flag = true;
            res[i][i] = 'Y';
            for (int j=i-1; j>=0; j--){
                if (j<n-1){
                    if (out[j+1] == 'Y' && in[j] == 'Y')
                        res[i][j] = 'Y';
                    else
                        break;
                }
            }
            for (int j=i+1; j<n; j++){
                if (j > 0){
                    if (out[j-1] == 'Y' && in[j] == 'Y')
                        res[i][j] = 'Y';
                    else
                        break;
                }
            }
        }

        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                System.out.print(res[i][j] == 'Y' ? 'Y' : 'N');
            }
            System.out.print("\n");
        }
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