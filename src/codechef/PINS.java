package codechef;

import java.math.BigInteger;
import java.util.Scanner;

public class PINS {
    public static void main(String arg[]){
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T-- > 0){
            int n;
            n = scanner.nextInt();
            BigInteger bg = new BigInteger("10");
            if (n%2 == 0)
                System.out.println(1 + " " + bg.pow(n-(n/2)));
            else
                System.out.println(1 + " " + bg.pow(n-((n+1)/2)));
        }
    }
}
/*
8
1
2
3
4
5
6
7
8
*/
