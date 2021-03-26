package codechef;

import java.util.Scanner;

public class TWOGRS {
    public static void main(String arg[]){
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T-- > 0){
            long a = scanner.nextLong();
            long b = scanner.nextLong();
            long c = scanner.nextLong();
            System.out.println(getSolution(a, b, c));
        }
    }

    private static String getSolution(long a, long b, long c) {
        long sum = a + 2*b + 3*c;
        if (sum%2 == 0){
            if (a==0 && c==0){
                if ( b%2 ==0)
                    return "YES";
                return "NO";
            }
            if (a == 0 && b == 1)
                return  "NO";
            if (a == 1 && b == 0)
                return  "NO";
            return  "YES";
        }
        else{
            return "NO";
        }
    }
}
