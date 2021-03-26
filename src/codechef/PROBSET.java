package codechef;

import java.util.Scanner;

public class PROBSET {
    public static void main(String arg[]){
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T-- > 0){
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            String[] intent = new String[n];
            String[] outcome = new String[n];
            for (int i=0; i<n; i++){
                intent[i] = scanner.next();
                outcome[i] = scanner.next();
            }
            boolean invalidflag = false;
            boolean weak = false;
            for (int i=0; i<n ; i++){
                if (intent[i].equals("correct")){
                   // System.out.println(intent[i]+ intent[i].equals("correct"));
                    //System.out.println(outcome[i]);
                    for (int j=0; j<m; j++){
                        if (outcome[i].charAt(j) != '1'){
                            //System.out.println(outcome[i] + "is invalid");
                            invalidflag = true;
                            break;
                        }
                    }
                }
                else if (intent[i].equals("wrong")){
                   // System.out.println(intent[i] + intent[i].equals("wrong"));
                    //System.out.println(outcome[i]);
                    int count = 0;
                    for (int j=0; j<m; j++){
                        if (outcome[i].charAt(j) == '1')
                            count++;
                    }
                    if (count == m){
                        weak = true;
                    }
                }
            }
            if (invalidflag == true)
                System.out.println("INVALID");
            else if (weak == true)
                System.out.println("WEAK");
            else
                System.out.println("FINE");
        }
    }
}
