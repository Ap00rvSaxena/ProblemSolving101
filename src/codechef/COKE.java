package codechef;

import java.util.Scanner;

public class COKE {
    public static void main(String arg[]){
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T-- > 0){
            int n,m, k, l, r;
            n = scanner.nextInt();
            m = scanner.nextInt();
            k = scanner.nextInt();
            l = scanner.nextInt();
            r = scanner.nextInt();
            int[] c = new int[n];
            int[] p = new int[n];
            int indx = -1;
            for (int i=0; i<n; i++){
                int temp = 0;
                c[i] = scanner.nextInt();
                p[i] = scanner.nextInt();
                if ( c[i]  > k+1){
                    temp = c[i] - (1*m);
                    if (temp < k)
                        temp = k;
                }
                if ( c[i]  < k-1){
                    temp = c[i] + (1*m);
                    if (temp > k)
                        temp = k;
                }
                if ( k-1 <= c[i] && c[i] <= k+1)
                    temp = k;
                //System.out.println(" Temp: " + temp);
                if (l <= temp && r >= temp){
                    if ( indx != -1){
                        //System.out.println(p[indx] + " > " + p[i]);
                        if (p[i] < p[indx]){
                            indx = i;
                        }
                    }
                    else
                        indx = i;
                }
            }
            if( indx != -1)
                System.out.println(p[indx]);
            else
                System.out.println(indx);
        }
    }
}
