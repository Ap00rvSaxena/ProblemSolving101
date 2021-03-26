import java.util.Arrays;
import java.util.Stack;

public class stockspan {
    public static void nostack(int[] p, int[] res){
        int n = p.length;
        for (int i=1; i<n; i++){
            int counter = 1;
            while ((i-counter) >=0 && p[i] >= p[i-counter])
                counter += res[i-counter];

            res[i] = counter;
        }
    }
    public static void main(String[] args){
        int[] stock = {100, 80, 60, 70, 60, 75, 85};
        //int[] stock = {10, 4, 5, 90, 120, 80};
        int n = stock.length;
        Stack<Integer> stack = new Stack<>();
        int[] res = new int[n];

        res[0] = 1;
        /*stack.push(0);
        for (int i=1; i<n; i++){
            while (!stack.empty() && stock[i] >= stock[stack.peek()])
                stack.pop();

            res[i] = stack.empty() ? (i+1) : (i-stack.peek());
            stack.push(i);
        }*/

        nostack(stock, res);
        System.out.print(Arrays.toString(res));
    }
}
