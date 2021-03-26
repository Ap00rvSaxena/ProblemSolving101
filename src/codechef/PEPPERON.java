package codechef;

import java.util.Scanner;

public class PEPPERON {
    public static void main(String arg[]){
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T-- > 0){
            int n = scanner.nextInt();
            int[][] p = new int[n][n];
            int[] pdiff = new int[n];
            int p1p2 = 0;
            for (int i=0; i<n; i++){
                String str = scanner.next();
                for (int j=0; j<n; j++){
                    p[i][j] = Integer.parseInt(String.valueOf(str.charAt(j)));
                }
                for (int j=0; j<n; j++){
                    if (j<n/2)
                        pdiff[i] += p[i][j];
                    else
                        pdiff[i] -= p[i][j];
                }
            }
            for (int i =0; i<n; i++){
                p1p2+= pdiff[i];
            }
            if (p1p2 ==0)
                System.out.println(p1p2);
            else {
                int min = 1000000;
                int ptemp = p1p2;
                for (int i=0; i<n; i++){
                    p1p2 = p1p2 - (2* pdiff[i]);
                    if (Math.abs(p1p2) < min)
                        min = Math.abs(p1p2);
                    p1p2 = ptemp;
                }
                System.out.println(min);
            }
        }
    }
}
