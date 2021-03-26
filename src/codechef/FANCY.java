package codechef;

import java.util.Scanner;

public class FANCY {
    public static void main(String arg[]){
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        scanner.nextLine();
        while (T-- > 0){
            String s = scanner.nextLine();
            //String sb = "not";
            if (s.contains("not ") || s.lastIndexOf(" not")+3 == s.length()-1)
                System.out.println("Real Fancy");
            else
                System.out.println("regularly fancy");
        }
    }
}
/*
i do not have any fancy quotes
when nothing goes right go left
not
blah not
*/