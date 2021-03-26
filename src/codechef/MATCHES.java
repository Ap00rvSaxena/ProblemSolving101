package codechef;

import java.util.Scanner;

public class MATCHES {
    public static void main(String arg[]){
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T-- > 0){
            long n = scanner.nextLong();
            long m = scanner.nextLong();
            long sum = n+m;
            long result = 0;
            long[] count = {6, 2, 5, 5, 4, 5, 6, 3, 7, 6};
            while (sum > 0){
                long indx = sum%10;
                sum = sum/10;
                //System.out.println("Sum" + sum);
                result += count[(int) indx];
            }
            System.out.println(result);
        }
    }
}
