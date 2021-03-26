package codechef;

import java.math.BigInteger;
import java.util.Scanner;

public class BFTT {
    public static void main(String arg[]){
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T-- > 0){
            long num = scanner.nextLong();
            num++;
            while ( !chck(num)){
                num++;
            }
            System.out.println(num);
        }
    }

    private static boolean chck(long l) {
        int cnt = 0;
        while (l!=0){
            if (l%10 == 3)
                cnt++;
            l = l/10;
            if (cnt>=3)
                return true;
        }
        return false;
    }
}