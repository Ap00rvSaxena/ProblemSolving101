package codechef;

import java.util.*;

public class SHKSTR {
    public static void main(String arg[]){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] s = new String[n];
        for (int i =0; i<n; i++){
            s[i] = scanner.next();
        }
        int q = scanner.nextInt();
        int[] r = new int[q];
        String[] p = new String[n];
        for (int i =0; i<q; i++){
            r[i] = scanner.nextInt();
            p[i] = scanner.next();
        }
        for (int i=0; i<q; i++){
            int maxPrefix = 0;
            List<String> maxPrefixString = new ArrayList<>();
            String smallest;
            for (int j=0; j<r[i]; j++){
                int prefix = checkPrefix(s[j], p[i]);
                if (maxPrefix < prefix){
                    maxPrefix = prefix;
                    maxPrefixString.clear();
                    maxPrefixString.add(s[j]);
                }
                else if (maxPrefix == prefix){
                    maxPrefixString.add(s[j]);
                }
            }
            if (maxPrefixString.size() < 1)
                maxPrefixString = Arrays.asList(s);
            smallest = maxPrefixString.get(0);
            for (int j=0; j<maxPrefixString.size(); j++){
                if (smallest.compareTo(maxPrefixString.get(j)) > 0){
                    smallest = maxPrefixString.get(j);
                }
            }
            maxPrefixString.clear();
            System.out.println(smallest);
        }

    }

    private static int checkPrefix(String s, String p) {
        String temp;
        if (s.length() < p.length()){
            temp = p;
            p = s;
            s = temp;
        }
        int prefixLength = -1;
        while (prefixLength == -1){
            if (s.startsWith(p))
                prefixLength = p.length();
            else {
                if (p != null && p.length() > 0) {
                    p = p.substring(0, p.length() - 1);
                }
                else
                    break;
            }
        }
        return  prefixLength;
    }
/*
4
abcd
abce
abcdex
abcde
4
3 abcy
3 abcde
4 abcde
4 efgh

Example Output
abcd
abcdex
abcde*/
}
