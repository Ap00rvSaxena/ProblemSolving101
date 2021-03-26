package codechef;

import java.util.Scanner;

public class ADAKNG {
    public static void main(String arg[]){
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T-- > 0){
            int r, c, k, count = 0;
            r = scanner.nextInt();
            c = scanner.nextInt();
            k = scanner.nextInt();
            int[][] arr = new int[8][8];
            for (int i=1; i<=8; i++){
                for (int j=1; j<=8; j++){
                    if ( (Math.abs(i-r)<=k) && (Math.abs(j-c)<=k))
                        count++;
                }
            }
            System.out.println(count);
        }
    }
}
/*
6
1 3 1
2 3 1
2 3 2
2 3 3
2 3 4
2 3 5*/
