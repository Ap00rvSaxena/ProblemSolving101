package codechef;

import java.util.Scanner;

public class BITOBYT {
    public static void main(String arg[]){
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T-- > 0){
            int n = scanner.nextInt();
            long bi=0, ni= 0, by=0;
            int multi, rem;
            if (n/26 > 0){
                multi = n/26;
                rem = n%26;
                if (rem == 0)
                    by = (long) Math.pow(2,multi-1);
                else{
                    if (rem>10 && rem <26){
                        by = (long) Math.pow(2,multi);
                    }
                    else if (rem <=10 && rem >2)
                        ni = (long) Math.pow(2,multi);
                    else  if (rem <=2)
                        bi = (long) Math.pow(2, multi);
                }
            }
            else {
                if (n>10 && n <=26){
                    by++;
                }
                else if (n <=10 && n >2)
                    ni++;
                else  if (n <=2)
                    bi++;
            }
            System.out.println(bi+" " + ni+ " " + by);
        }
    }
}
