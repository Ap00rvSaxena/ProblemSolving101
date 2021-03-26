package codechef;

import java.util.ArrayList;
import java.util.List;

public class AA {

    /*
    [2:06 PM] Kavountzis, Andreas - Vendor (Guest)
The Collatz Conjecture states that for any natural number n, if n is even, divide it by 2.
If n is odd, multiply it by 3 and add 1.
The Conjecture states that if you repeat the process continuously for n, n will eventually reach 1.
When n reaches 1, then the sequence is complete.
For example, if n = 20, the resulting sequence will be: {20, 10, 5, 16, 8, 4, 2, 1}.
Write a method that returns the Collatz Sequence for any given n.
     */

    public static List<Integer> createCollatzConjecture(int n){
        List<Integer> res = new ArrayList<>();
        while (n != 1){
            //if Even
            if (n%2 == 0){
                res.add(n);
                n /= 2;
            }
            else{
                res.add(n);
                n = n*3 +1;
            }
        }
        res.add(n);
        return res;
    }

    public static void main(String[] args){
        int n = 20; // 1 ..... 2^31 -1
        List<Integer> res = createCollatzConjecture(n);
        System.out.println(res);
    }

}
