import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class SherlockandtheValidString {

    // Complete the isValid function below.
    static String isValid(String s) {int n = s.length();
        int diff = 0;
        int[] freq = new int[26];
        for (char c : s.toCharArray())
            freq[c - 'a']++;
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for (int i=0; i<26; i++){
            if(freq[i] != 0){
                if(!map.containsKey(freq[i])){
                    map.put(freq[i], 1);
                }
                else
                    map.put(freq[i], map.get(freq[i])+1);
            }
        }
        if (map.size() > 2)
            return "NO";
        if (map.size() == 1)
            return "YES";
        int keydiff=0;
        int max = -1;
        List<Integer> list2 = new ArrayList<>();
        for (Map.Entry mapElement : map.entrySet()) {
            int key = (int)mapElement.getKey();
            int value = (int)mapElement.getValue();
            keydiff = Math.abs(key - keydiff);
            list2.add(key);
            list.add(value);
            System.out.println(key + " : " + value + " Keydiff: " + keydiff);
        }
        System.out.println("Sorted Array: " + list.toString());

        if (list.get(0) == 1 && (list2.get(0) == 1 || Math.abs(list2.get(0)-list2.get(1)) == 1))
            return "YES";

        if ((list.get(1) == 1 && (list2.get(1) == 1 || Math.abs(list2.get(0)-list2.get(1)) == 1 )))
            return "YES";
        return "NO";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        String result = isValid(s);
        System.out.println(result);
//        bufferedWriter.write(result);
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();
    }
}
