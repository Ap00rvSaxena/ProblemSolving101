package codechef;

import java.util.Scanner;

public class BINSHFFL {
    static long ones( long A )
    {
        int result = 0;
        for ( ; A>=1; A /= 2 ) result += A % 2;
        return result;
    }
    public static void main(String arg[]){
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T-- > 0){
            long a,b;
            a = scanner.nextLong();
            b = scanner.nextLong();
            if (a==b)
                System.out.println(0);
            else if (b==0)
                System.out.println(-1);
            else if (b==1){
                if (a==0)
                    System.out.println(1);
                else
                    System.out.println(-1);
            }
            else {
                long ops = ones( b - 1 ) - ones( a ) + 1;
                System.out.println(ops > 0 ? ops : 2);
            }
        }
    }
/*
Example Input
2
2 4
1 5
Example Output
2
1
*/
}
