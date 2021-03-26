package codechef;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.min;

public class CHEFINSQ {
    // Returns value of Binomial Coefficient C(n, k)
    static long binomialCoeff(int n, int k)
    {
        long C[][] = new long[n+1][k+1];
        int i, j;

        // Calculate  value of Binomial Coefficient in bottom up manner
        for (i = 0; i <= n; i++)
        {
            for (j = 0; j <= min(i, k); j++)
            {
                // Base Cases
                if (j == 0 || j == i)
                    C[i][j] = 1;

                    // Calculate value using previously stored values
                else
                    C[i][j] = C[i-1][j-1] + C[i-1][j];
            }
        }

        return C[n][k];
    }

    public static void main(String arg[]){
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T-- > 0){
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int[] arr = new int[n];
            for (int i=0; i<n; i++){
                arr[i] = scanner.nextInt();
            }
            //System.out.println(printSubsequences(arr,n,k));
            int[] freq = new int[101];
            for (int i=0; i<n; i++){
                freq[arr[i]] += 1;
            }
            int[] freqCount = freq.clone();
            for (int i=1; i<101; i++){
                freq[i] += freq[i-1];
            }
            int[] sorted =  new int[n];
            for (int i=0; i<n; i++){
                sorted[freq[arr[i]]-1] = arr[i];
                freq[arr[i]]--;
            }
            //System.out.println("Sorted Array: " + Arrays.toString(sorted));
            int  min = 0;
            for (int i=0; i<k; i++){
                min += sorted[i];
            }
            int kcount =0, sum = 0;
            long count = 1;
            //System.out.println("FreqCount Array: " + Arrays.toString(freqCount));
            for (int i=0; i<101; i++){
                if (freqCount[i] != 0){
                    sum += i*freqCount[i];
                    kcount = freqCount[i];
                    //System.out.println("KCount: " + kcount + " K: " + k+ " Count: " + count);
                    if (sum >= min){
                        count = count * binomialCoeff(kcount, k);
                        break;
                    }
                    else {
                        if ( kcount < k){
                            k -= kcount;
                        }
                        else{
                            count = count * binomialCoeff(kcount, k);
                        }
                    }
                }
            }
           // System.out.println("Bino: " + binomialCoeff(50, 24));
            System.out.println(count);
        }
    }
}
/*
5
4 2
1 2 3 4
4 2
1 1 1 1
4 3
1 1 1 1
6 3
1 1 2 2 3 4
7 5
1 1 2 2 2 2 2
*/