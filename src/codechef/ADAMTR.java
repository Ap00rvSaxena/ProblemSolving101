package codechef;

import java.util.Scanner;

public class ADAMTR {
    public static void main(String arg[]){
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T-- > 0){
            int n = scanner.nextInt();
            int[][] a = new int[n][n];
            int[][] b = new int[n][n];
            for (int i=0; i<n;i++){
                for (int j=0; j<n;j++){
                    a[i][j] = scanner.nextInt();
                }
            }
            for (int i=0; i<n;i++){
                for (int j=0; j<n;j++){
                    b[i][j] = scanner.nextInt();
                }
            }
            int[] count = new int[n];
            for (int i=0; i<n-1;i++){
                for (int j=0; j<n;j++){
                    if (a[i][j] != b[i][j] && a[i][j] == b[j][i])
                        count[j] += 1;
                }
            }
        }
    }
}
