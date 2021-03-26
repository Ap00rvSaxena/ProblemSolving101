package codechef;

import java.util.Scanner;

public class NAICHEF {

    public static void main(String arg[]){
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T-- > 0){
            int n, a,b;
            double countA=0, countB=0;
            n = scanner.nextInt();
            a = scanner.nextInt();
            b = scanner.nextInt();
            int[] x = new int[n];
            for (int i=0;i<n; i++){
                x[i] = scanner.nextInt();
                if (x[i]==a)
                    countA++;
                if (x[i]==b)
                    countB++;
            }
            //System.out.println(countA + " " + countB);
            double pA = countA/n;
            double pB = countB/n;
            System.out.println(pA*pB);
        }
    }
    /*2
    5 1 1
    1 1 1 1 1
    2 1 1
    1 2*/

}
