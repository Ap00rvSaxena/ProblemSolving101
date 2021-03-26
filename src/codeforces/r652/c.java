package codeforces.r652;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class c {

    public static void main(String[] args){
        Scanner scanner = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int T = scanner.nextInt();
        while(T-->0){
            int n = scanner.nextInt();
            testcase(n);
        }
    }

    private static void testcase(int n) {
        System.out.println(n/2);
    }
}
