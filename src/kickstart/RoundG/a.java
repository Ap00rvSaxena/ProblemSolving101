package kickstart.RoundG;

import java.io.*;
import java.util.*;

public class a {
    public static Scanner scanner;
    public static void main(String[] args){
        scanner = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int T = scanner.nextInt();
        for(int j=1; j<=T; j++){
            String s = scanner.next();

            //long start = System.currentTimeMillis();

            System.out.print("Case #"+ j +": ");
            testcase(s);

            //long end = System.currentTimeMillis();
            //NumberFormat formatter = new DecimalFormat("#0.00000");
            //System.out.println("Execution time is " + formatter.format((end - start) / 1000d) + " seconds");
        }
    }

    public static void testcase(String s) {
        int count = 0;
        if (s == null || s.length() < 1){
            System.out.print(count +"\n");
            return;
        }
        int n = s.length();
        List<Integer> listk = new ArrayList<>();
        List<Integer> lists = new ArrayList<>();
        for (int i=0; i<=n-4; i++){
            String tempk = s.substring(i,i+4);
            if (tempk.compareTo("KICK") == 0)
                listk.add(i+3);
            if (i<= n-5){
                String temps = s.substring(i, i+5);
                if (temps.compareTo("START") == 0)
                    lists.add(i+4);
            }
        }
        int last = lists.size();
        //System.out.println(listk);
        //System.out.println(lists);
        for (int i : listk){
            int idx = Collections.binarySearch(lists,i);
            //System.out.println(idx);
            if (idx < 0){
                idx = -1*idx -1;
            }
            count += (last-idx);
        }
        System.out.print(count +"\n");
    }
}
