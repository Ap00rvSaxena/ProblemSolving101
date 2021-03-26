package codechef;

import java.util.Scanner;

public class JDELAY {
    public static void main(String arg[]){
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T-- > 0){
            int n = scanner.nextInt();
            int s, j;
            int count = 0;
            for (int i=0; i<n; i++){
                s = scanner.nextInt();
                j = scanner.nextInt();
                if (j-s > 5)
                    count++;
            }
            System.out.println(count);
        }
    }
}
