package kickstart.RoundE;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class b {
    public static Scanner scanner;
    public static void main(String[] args){
        scanner = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int T = scanner.nextInt();
        for(int j=1; j<=T; j++){
            int n = scanner.nextInt();
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();

            //long start = System.currentTimeMillis();

            System.out.print("Case #"+ j +": ");
            testcase(n, a, b, c);

            //long end = System.currentTimeMillis();
            //NumberFormat formatter = new DecimalFormat("#0.00000");
            //System.out.println("Execution time is " + formatter.format((end - start) / 1000d) + " seconds");
        }
    }

    public static String  printArr(List<Integer> l){
        String res = "";
        for (int i : l)
            res += (i + " ");
        return res.trim();
    }
    public static void testcase(int n, int a, int b, int c) {
        int count = 0;
        String imp = "IMPOSSIBLE";
        if (c > n || (a == b && b == n && c != n)){
            System.out.print(imp + "\n");
            return;
        }
        int h = n;
        int ah = h-1;
        int bh = h-1;
        int anot = n -a;
        int bnot = n -b;
        LinkedList<Integer> arr = new LinkedList<>();
        while (count++ < n && (a !=0 || b !=0 || c !=0 )){
            if ( c > 0){
                arr.add(h);
                c--;
                a--;
                b--;
            }
            else{
                if (a > 0){
                    arr.addFirst(ah);
                    a--;
                    bnot--;
                }
                if (b > 0){
                    arr.add(bh);
                    b--;
                    anot--;
                }
            }
        }
        int rem = n - arr.size();
        if (rem > 0){
            int idx = 1;
            if (arr.getFirst() == h){
                idx = arr.size()-1;
            }
            else if (arr.getLast() == h){
                idx = 1;
            }
            else{
                System.out.print(imp + "\n");
                return;
            }
            arr.add(idx, 1);
        }
        System.out.print(printArr(arr) + "\n");
    }
}
