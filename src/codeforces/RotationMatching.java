package codeforces;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class RotationMatching {
    public static void main(String[] args){
        Scanner scanner = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int T = 1;//scanner.nextInt();
        while(T-->0){
            int n = scanner.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            for(int i=0; i<n; i++){
                a[i] = scanner.nextInt();
            }
            String bString = "";
            for(int i=0; i<n; i++){
                b[i] = scanner.nextInt();
                bString += b[i]+"";
            }
            testcase(a,b, bString, n);
        }
    }

    private static void testcase(int[] a, int[] b, String bString, int n) {
        int count = 0;
        for (int i=0; i<n; i++){
           // if (b[i] == first){
                //startIdx = i;
                break;
            //}
        }
        System.out.println(count);
    }
}
