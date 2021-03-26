package codeforces.eduR90;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class a {

    public static void main(String[] args){
        Scanner scanner = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int T = scanner.nextInt();
        while(T-->0){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            testcase(a,b,c);
        }
    }

    private static void testcase(int a,int b,int c) {
        int resA = c > a ? 1 : -1;
        int resB = 1L*a*b > c ? b : -1;
        System.out.println(resA + " " + resB);
    }
}
