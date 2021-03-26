package codechef;

import java.util.Scanner;

public class NSA {
    public static void main(String arg[]){
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T-- > 0){
            String s = scanner.next();
            char[] str  = s.toCharArray();
            String str1 = s;
            int str_len=s.length();
            int count_val = 0;
            int min_val=100000000;
            for(int i=0; i<str_len; i++)

            {
                for(int j=97; j<=122; j++)
                {
                    str[i]= (char)j;
                    for(int k=0; k<i ; k++)
                    {
                        count_val = 0;
                        for(int l=k+1; l<i; l++)
                        {
                            if((int)str[k] < (int)str[l])
                                count_val++;
                        }
                    }
                }

                count_val = count_val+ Math.abs( (int)str[i] - (int)str1.charAt(i) );

                if(count_val < min_val)
                    min_val=count_val;
            }
            System.out.println(min_val);
        }
        }
    }
/*
Example Input
3
abcd
dbca
dcba
Example Output
6
1
0*/
