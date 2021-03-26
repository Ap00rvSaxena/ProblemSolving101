package codeforces.r652;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

public class b {

    public static void main(String[] args){
        Scanner scanner = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int T = scanner.nextInt();
        while(T-->0){
            int n = scanner.nextInt();
            String s  = scanner.next();
            testcase(n,s);
        }
    }

    private static void testcase(int n, String s) {
        StringBuilder sb = new StringBuilder();
        boolean flag = true;
        for (int i=0; i<n-1; i++){
            if (Integer.valueOf(s.charAt(i)) > Integer.valueOf(s.charAt(i+1)))
                flag = false;
        }
        if (flag){
            System.out.println(s);
            return;
        }
        for (int i=0; i<n-1; i++){
            if (s.charAt(i) == '1')
                break;
            sb.append('0');
        }
        sb.append('0');
        for (int i=n-1; i>=0; i--){
            if (s.charAt(i) == '0')
                break;
            sb.append('1');
        }
        System.out.println(sb.toString());
        }
}
