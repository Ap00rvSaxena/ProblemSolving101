package codechef;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class EID {
    public static void main(String arg[]){
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T-- > 0){
            int n = scanner.nextInt();
            long[] v = new long[n];
            List<Long> list = new ArrayList<>();
            for (int i=0; i<n; i++){
                v[i] = scanner.nextLong();
                list.add(v[i]);
            }
            Collections.sort(list);
            //System.out.println(list);
            long min = 100000000;
            for (int i=0; i<n-1; i++){
                if (min > Math.abs(list.get(i) - list.get(i+1)))
                    min = Math.abs(list.get(i) - list.get(i+1));
            }
            System.out.println(min);
        }
    }
}
