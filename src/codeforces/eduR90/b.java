package codeforces.eduR90;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class b {

    public static void main(String[] args){
        Scanner scanner = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int T = scanner.nextInt();
        while(T-->0){
            String a = scanner.next();
            testcase(a);
        }
    }

    private static void testcase(String s) {
        int n = s.length();
        int countZeros = 0;
        for (char c : s.toCharArray()){
            if (c == '0')
                countZeros++;
        }
        System.out.println(Math.min(countZeros, n-countZeros)%2 == 0 ? "NET" : "DA");
    }
}
