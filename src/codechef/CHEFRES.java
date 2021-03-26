package codechef;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CHEFRES {
    public static void main(String arg[]){
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T-- > 0){
            long n = scanner.nextInt();
            long m = scanner.nextInt();
            List<Long> listL = new ArrayList<>();
            List<Long> listR = new ArrayList<>();
            for (int i=0; i<n; i++){
                listL.add(scanner.nextLong());
                listR.add(scanner.nextLong());
            }
            Collections.sort(listL);
            Collections.sort(listR);
            for (int i=0; i<m; i++){
                long x = scanner.nextLong();
                int indx = Collections.binarySearch(listL,x);
                if (indx>=0)
                    System.out.println(0);
                else if (x>=listR.get((int) (n-1)))
                    System.out.println(-1);
                else if (x < listL.get(0))
                    System.out.println(listL.get(0)-x);
                else {
                    int leftIndex = (-indx - 2);
                    int rightIndex = leftIndex +1;
                    if (listR.get(leftIndex) > x)
                        System.out.println(0);
                    else
                        System.out.println(listL.get(rightIndex)-x);
                }
            }
        }
    }
}
