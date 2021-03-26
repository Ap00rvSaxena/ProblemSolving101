package codechef;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class MINDSUM {

    public static int count=0;

    static long digitsum(long n){
        long sum = 0;
        do{
            sum += (n%10);
            n = n/10;
        }
        while (n > 0);
        if (sum<10){
            count++;
            return sum;
        }
        else{
            count++;
            return digitsum(sum);
        }
    }
    public static void main(String arg[]){
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T-- > 0){
            long n, d;
            n = scanner.nextLong();
            d = scanner.nextLong();
            HashMap<Long, Integer> hash = new HashMap<>();
            for (int i=0; i<9; i++){
                count = 0;
                long temp = n + (i*d);
                temp = digitsum(temp);
                System.out.println(temp + " " + (i+count));
                if (!hash.containsKey(temp)){
                    hash.put(temp,i+count);
                    if (temp == 1)
                        break;
                }
                else
                    break;

            }
            long min = Long.MAX_VALUE;
            int index = -1;
            Iterator it = hash.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry pair = (Map.Entry)it.next();
                if (min > (long)pair.getKey()){
                    min = (long)pair.getKey();
                    index = (int) pair.getValue();
                }
                it.remove(); // avoids a ConcurrentModificationException
            }
            if (min == n)
                index = 0;
            System.out.println(min + " " + index);
            //System.out.println(digitsum(n) + " " + count);
        }
    }
}
/*
12
2 1
9 3
11 13
6 3
12 15
15 3
16 4
2 10
1 2
3 9
13 11
10 2


1 9
3 2
1 4
3 3
3 1
3 3
1 5
1 10
1 0
3 0
1 5
1 1*/
