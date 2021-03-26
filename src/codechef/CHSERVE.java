package codechef;

import java.util.Scanner;

public class CHSERVE {
    public static void main(String arg[]){
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T-- > 0){
            long p = scanner.nextLong();
            long q = scanner.nextLong();
            long k = scanner.nextLong();
            long sum = p+q;
            if (sum%k == 0){
                if (((sum/k)%2) == 0)
                    System.out.println("CHEF");
                else
                    System.out.println("COOK");
            }
            else{
                sum = sum -(sum%k);
                if (((sum/k)%2) == 0)
                    System.out.println("CHEF");
                else
                    System.out.println("COOK");
            }
        }
    }
}
