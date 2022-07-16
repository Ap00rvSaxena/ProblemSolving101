package amazon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class a {
    public static Scanner scanner;
    public static void main(String[] args){
        //scanner = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int T = 1;
        for(int j=1; j<=T; j++){
            //String s = scanner.next();

            //long start = System.currentTimeMillis();
            List<List<Integer>> l = new ArrayList<>();
            List<Integer> l1 = new ArrayList<>(Arrays.asList(1,2));
            List<Integer> l2 = new ArrayList<>(Arrays.asList(3,4));
            List<Integer> l3 = new ArrayList<>(Arrays.asList(1,-1));
            l.add(l1);
            l.add(l2);
            l.add(l3);
            List<List<Integer>> res = testcase(l, 2);
            for (List<Integer> i : res)
                System.out.print(i);

            //long end = System.currentTimeMillis();
            //NumberFormat formatter = new DecimalFormat("#0.00000");
            //System.out.println("Execution time is " + formatter.format((end - start) / 1000d) + " seconds");
        }
    }

    public static List<List<Integer>> testcase(List<List<Integer>> list, int x) {
        if (list == null || list.size() < 1){
            return new ArrayList<>();
        }
        int n = list.size();
        List<List<Integer>> res = new ArrayList<>();
        PriorityQueue<List<Integer>> pq= new PriorityQueue<List<Integer>>(new Comparator<List<Integer>>() {
            @Override
            public int compare(List<Integer> a, List<Integer> b) {
                double r1 = (Math.sqrt((a.get(0)*a.get(0)) + (a.get(1)*a.get(1))));
                double r2 = (Math.sqrt((b.get(0)*b.get(0))+ (b.get(1)*b.get(1))));
                if (r1 > r2)
                    return -1;
                else
                    return 1;
            }
        });
        for (List<Integer> i: list){
            pq.add(i);
            if (pq.size() > x)
                pq.poll();
        }

        while(pq.size() > 0)
            res.add(0,pq.poll());
        return res;
    }
}
