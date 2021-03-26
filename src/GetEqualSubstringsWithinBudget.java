import java.util.*;

public class GetEqualSubstringsWithinBudget {
    public static void main(String arg[]){
        Scanner scanner = new Scanner(System.in);
        String  s = scanner.next();
        String t = scanner.next();
        int maxcost = scanner.nextInt();
        s = s.substring(1, s.length()-1);
        t = t.substring(1, t.length()-1);
        //System.out.println(s + " " + t + " : " + maxcost);
        long count = 0;
        for (int i=0; i<s.length(); i++){
            int diff = Math.abs(((int)s.charAt(i)) - ((int)t.charAt(i)));
            if (maxcost < diff){
                break;
            }
            else {
                maxcost = maxcost - diff;
                count++;
            }
        }
        System.out.println(count);
    }
}
