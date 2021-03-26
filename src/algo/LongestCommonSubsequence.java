package algo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class LongestCommonSubsequence {
    public static void main(String[] args){
        try{
            File file = new File(args[0]);
            BufferedReader br = new BufferedReader(new FileReader(file));
            String st;
            List<String> list = new ArrayList<>();
            while ((st = br.readLine()) != null){
                //System.out.println(st);
                list.add(st);
            }
            if (list.size()%2 != 0){
                System.out.println("Uneven Input Strings...!!!");
                System.exit(0);
            }
            System.out.println("Subsequence \tLength");
            for(int i=0; i<list.size(); i+=2){
                findLCS(list.get(i),list.get(i+1));
            }
        }
        catch (Exception e) {
            System.out.println("File Doesn't Exists...!!!");
            //e.printStackTrace();
        }
    }

    private static void findLCS(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        int[][] dp = new int[n+1][m+1];
        for (int i=1; i<dp.length; i++){
            for (int j=1; j<dp[0].length; j++){
                if(s1.charAt(i-1) == s2.charAt(j-1))
                    dp[i][j] = dp[i-1][j-1] + 1;
                else
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
            }
        }
        int len = dp[n][m];
        //System.out.println("Result: " + dp[n][m]);
        char[] res = new char[len];
        int i =n, j=m;
        while (i >0 &&  j>0){
            if (s1.charAt(i-1) == s2.charAt(j-1)){
                res[len-1] = s1.charAt(i-1);
                i--;
                j--;
                len--;
            }
            else if (dp[i-1][j] > dp[i][j-1])
                i--;
            else
                j--;
        }
        for(i=0;i<dp[n][m];i++)
            System.out.print(res[i]);
        System.out.print("\t" + dp[n][m]);
        System.out.println();
    }
}