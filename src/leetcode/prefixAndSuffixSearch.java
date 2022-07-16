import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class prefixAndSuffixSearch {
    public static Scanner scanner;
    public static void main(String[] args){
        System.out.println(f(new String[]{"apple"},  "a",  "e"));
    }
    
    public static int f(String[] dic, String prefix, String suffix) {
        int n = dic.length;
        int plen = prefix.length();
        int slen = suffix.length();
        int res = -1;
        for (int i=0; i<n; i++){
            String curr = dic[i];
            int len = curr.length();
            int start = 0;
            int end = len-1;
            boolean sflag = false;
            boolean eflag = false;
            
            while ((start < plen && start < len ) && ((end >= 0 && end >= len-slen))){
                int pIndex = start;
                int sIndex = len-end-1;
                if (((prefix.charAt(start) == curr.charAt(start )) || sflag) && ((suffix.charAt(len-end-1) == curr.charAt(end)) || eflag)) {
                    start++;
                    end--;
                    if (start == plen){
                        sflag = true;
                    }
                    if (end == len-slen)
                        eflag = true;
                }
            }
            if (sflag && eflag){
               res = Math.max(res, i);
            }
        }
        return res;
    }
}