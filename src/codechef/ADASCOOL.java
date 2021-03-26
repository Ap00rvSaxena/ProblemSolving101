package codechef;

import java.util.Scanner;

public class ADASCOOL {
    public static void main(String arg[]){
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T-- > 0){
            int n,m;
            n = scanner.nextInt();
            m = scanner.nextInt();
            if ((n*m)%2 == 0)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
