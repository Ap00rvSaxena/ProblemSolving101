package codechef;

import java.util.Scanner;

public class CHEFADV {
    public static void main(String arg[]){
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T-- > 0){
            long n, m, x, y;
            n = scanner.nextLong();
            m = scanner.nextLong();
            x = scanner.nextLong();
            y = scanner.nextLong();
            long knw = 1, pow = 1, shrchat = 1;
            n = n-1;
            m = m-1;
            if (n%x == 0 && m%y ==0)
                System.out.println("Chefirnemo");
            else if ((n-1)%x == 0 && (m-1)%y ==0 && n>0 && m>0)
                System.out.println("Chefirnemo");
            else
                System.out.println("Pofik");
        }
    }
}
