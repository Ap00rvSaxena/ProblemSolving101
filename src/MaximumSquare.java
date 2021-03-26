import java.util.Arrays;
import java.util.Scanner;

public class MaximumSquare {
    public static void main(String arg[]){
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T-- > 0){
            int n = scanner.nextInt();
            int count=1;
            int[] a = new int[n];
            for(int i=0; i<n; i++){
                a[i] = scanner.nextInt();
            }
            Arrays.sort(a);
            for(int i=n-1; i>=0; i--){
                //System.out.println(a[i]+ " x -> count "  + count);
                if(a[i] >= count)
                    count++;
                else
                    break;
            }
            System.out.println(count-1);
        }
    }
}
