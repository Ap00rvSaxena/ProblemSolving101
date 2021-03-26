package codechef;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MAGICHF {
    public static void main(String arg[]){
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T-- > 0){
            int n = scanner.nextInt();
            int x = scanner.nextInt();
            int s = scanner.nextInt();
            int key = x;
            for (int i=0; i<s; i++){
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                if (a == key)
                    key = b;
                else if (b == key)
                    key = a;
            }
            System.out.println(key);
        }
    }
}
