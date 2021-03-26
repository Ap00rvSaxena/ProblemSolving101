package codeforces;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class TroubleSort {
    public static void main(String[] args){
        Scanner scanner = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int T = scanner.nextInt();
        while(T-->0){
            int n = scanner.nextInt();
            int[] a = new int[n];
            int[] ca = new int[n];
            int[] t = new int[n];
            for(int i=0; i<n; i++){
                a[i] = scanner.nextInt();
                ca[i] = a[i];
            }
            int zeros = 0, ones=0;
            for(int i=0; i<n; i++){
                t[i] = scanner.nextInt();
                if (t[i] == 0)
                    zeros++;
                else
                    ones++;
            }
            Arrays.sort(ca);
            //System.out.println(Arrays.toString(a) + " = "+Arrays.toString(ca));
            boolean f = ones == 0 || zeros ==0;
            boolean g = false;
            for(int i=0; i<n; i++){
                if (a[i] != ca[i] && f){
                    System.out.println("No");
                    g = true;
                    break;
                }
            }
            if (!g)
                System.out.println("Yes");
        }
    }
}
