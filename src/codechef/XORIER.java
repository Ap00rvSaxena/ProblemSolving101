package codechef;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

class XORIER {
    static long xorPairCount(long arr[], int n, int x)
    {
        long count = 0; // Initialize result

        HashMap<Long, Long> hash = new HashMap<>();

        for (int i = 0; i < n; i++) {
            if (!hash.containsKey(arr[i]))
                hash.put(arr[i], (long)0);
        }

        for (int i = 0; i < n; i++) {
            if (hash.containsKey(arr[i]^x) && hash.get(arr[i]^x) !=0) {
                count += hash.get(arr[i]^x);
            }
            hash.put(arr[i], hash.get(arr[i]) + 1);
        }
        return count;
    }
    public static void main(String arg[]){
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T-- > 0){
            int n = scanner.nextInt();
            long[] a = new long[n];
            long odd =0, even = 0, count2 = 0;
            for (int i=0; i<n; i++){
                a[i] = scanner.nextLong();
                if (a[i]%2 == 0){
                    even++;
                   // evenlist.add(a[i]);
                }
                else{
                    odd++;
                   // oddlist.add(a[i]);
                }
            }
            count2 += xorPairCount(a,n, 2);
            count2 += xorPairCount(a,n, 0);
            long evenpair = (n*(n-1)/2) - (even*odd);
            System.out.println(evenpair-count2);
        }
    }
}