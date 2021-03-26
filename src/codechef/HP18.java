package codechef;

import java.util.Scanner;

public class HP18 {
    public static void main(String arg[]){
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T-- > 0){
            int N = scanner.nextInt();
            long a = scanner.nextLong();
            long b = scanner.nextLong();
            long[] arr = new long[N];
            int aN=0, bN = 0, cN= 0;
            for (int i=0; i<N; i++){
                arr[i] = scanner.nextLong();
                if (arr[i]%b == 0 && arr[i]%a == 0)
                    cN++;
                else if (arr[i]%a == 0)
                    aN++;
                else if (arr[i]%b == 0)
                    bN++;
            }
            System.out.println((aN > bN - (cN > 0 ? 1 : 0)? "BOB" : "ALICE"));
            /*if (cN%2 == 0){
                if (bN >= aN)
                    System.out.println("ALICE");
                else if (aN > bN)
                    System.out.println("BOB");
            }
            else {
                if (bN <= aN)
                    System.out.println("BOB");
                else if (aN < bN)
                    System.out.println("ALICE");
            }*/
        }
    }
}
/*
3
5 3 2
1 2 3 4 5
5 2 4
1 2 3 4 5
10 1 1
1 2 3 4 5 6 7 8 9 10
*/