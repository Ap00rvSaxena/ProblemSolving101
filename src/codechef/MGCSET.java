package codechef;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MGCSET {
    public static void main(String arg[]){
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T-- > 0){
            int n, m;
            n = scanner.nextInt();
            m = scanner.nextInt();
            long[] a = new long[n];
            long count = 0;
            for (int i=0; i<n; i++){
                a[i] = scanner.nextLong();
                if (a[i]%m == 0){
                    count++;
                }
            }
            System.out.println((long) Math.pow(2,count)-1);
        }
    }
}
/*
3
2 3
1 2
2 3
1 3
5 3
3 1 2 4 5
*/
