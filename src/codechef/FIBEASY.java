package codechef;

import java.util.Scanner;

public class FIBEASY {
    public static void main(String arg[]){
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T-- > 0){
            long n = scanner.nextLong();
            int p = (int)(Math.log(n) / Math.log(2));
            //System.out.println("Check value: " + (Math.log(n) / Math.log(2)) + " with int: " + (int)(Math.log(n) / Math.log(2)));
            int[] ans = {2, 3, 0 ,9};
            if (n < 4){
                System.out.println((int)(n/2));
            }
            else {
                if ((long)Math.pow(2,p) > n){
                    //System.out.println("Check Condition: " + (long)Math.pow(2,p) + " > " + n);
                    p =p-1;
                }
                int idx = (int) ((p+2) % 4L);
                System.out.println(ans[idx]);
            }
        }
    }
}
/*
1
1000000000000000000
A parking system web application built with a motive to grasp the profound principles of Automation Testing


 */