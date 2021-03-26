import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CharacterSwapEasyVersion {
    public static void main(String arg[]){
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T-- > 0){
            int n = scanner.nextInt();
            int diff = 0;
            String s1 = scanner.next();
            String s2 = scanner.next();
            char[] a = s1.toCharArray();
            char[] b = s2.toCharArray();
            List<Character> list1 = new ArrayList<>();
            List<Character> list2 = new ArrayList<>();
            for(int i=0; i<n && diff <= 2; i++){
                if(a[i] != b[i]){
                    diff++;
                    list1.add(a[i]);
                    list2.add(b[i]);
//                    sb1.append(a[i]);
//                    sb2.append(b[i]);
//                    d1[a[i] -'a']++;
//                    d2[b[i] -'a']++;
                }
            }
//            System.out.println(list1.toString());
//            System.out.println(list2.toString());
            boolean flag = true;
            if (diff != 2)
                System.out.println("NO");
            else{
                if (list1.get(0) == list1.get(1) && list2.get(0) == list2.get(1))
                    System.out.println("YES");
                else
                    System.out.println("NO");
            }
        }
    }
}
/*
6
5
souse
houhe
3
cat
dog
2
aa
az
3
abc
bca
6
abbbbc
abbcbb
6
abbbbb
abbcbc
 */