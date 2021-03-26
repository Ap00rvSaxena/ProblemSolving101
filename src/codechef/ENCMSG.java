package codechef;

import java.util.HashMap;
import java.util.Scanner;

public class ENCMSG {
    public static void main(String arg[]){
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T-- > 0){
            int n = scanner.nextInt();
            String s = scanner.next();
            char[] arr = s.toCharArray();
            int alphaLen = 26;
            HashMap<Character, Character> algo = new HashMap<Character, Character>(alphaLen);
            char[] enc1 = arr;
            char[] enc2 = new char[n];
            char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
            for (int i =0; i<alphaLen; i++){
                algo.put(alphabet[i], alphabet[alphaLen-i-1]);
            }
            for (int i =0; i<=n-2; i+=2){
                char temp = enc1[i];
                enc1[i] = enc1[i+1];
                enc1[i+1] = temp;
            }
            for (int i =0; i<n; i++){
                enc2[i] = algo.get(enc1[i]);
            }
            System.out.println(enc2);
        }
    }
}
