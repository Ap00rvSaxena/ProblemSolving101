package codeforces.eduR95;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class a {

    public static void main(String[] args){
        Scanner scanner = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int T = scanner.nextInt();
        while(T-->0){
            long a = scanner.nextLong();
            long b = scanner.nextLong();
            long c = scanner.nextLong();
            testcase(a,b,c);
        }
    }

    private static void testcase(long x, long y, long k) {
        long need = ((k*y) + (k-1));
        long res = need/(x-1);
        System.out.println((need%(x-1) == 0 ? res : res+1) +k);
    }
}
