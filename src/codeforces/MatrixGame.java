package codeforces;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class MatrixGame {
    public static void main(String[] args){
        Scanner scanner = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int T = scanner.nextInt();
        while(T-->0){
            int n = scanner.nextInt();
            int m = scanner.nextInt();

            int[][] a = new int[n][m];
            int[] row = new int[n];
            int[] col = new int[m];
            for(int i=0; i<n; i++){
                for(int j=0; j<m; j++){
                    a[i][j] = scanner.nextInt();
                    if (a[i][j] == 1){
                        row[i] = 1;
                        col[j] = 1;
                    }
                }
            }
            int rcount = 0, ccount = 0;
            for (int i : row){
                if (i != 1){
                    rcount++;
                }
            }
            for (int j : col){
                if (j != 1){
                    ccount++;
                    //break;
                }
            }
            if (Math.min(rcount, ccount)%2 == 0)
                System.out.println("Vivek");
            else
                System.out.println("Ashish");
        }
    }
}
