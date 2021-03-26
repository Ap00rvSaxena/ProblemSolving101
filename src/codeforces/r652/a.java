package codeforces.r652;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class a {

    public static void main(String[] args){
        Scanner scanner = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int T = scanner.nextInt();
        while(T-->0){
            int n = scanner.nextInt();
            testcase(n);
        }
    }

    private static void testcase(int n) {
        //double angle = 360.0/n;
        //System.out.println("Ang: " + angle);
        if ( n > 3 && n%4 == 0)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
