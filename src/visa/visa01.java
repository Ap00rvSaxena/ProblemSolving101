package visa;

import java.util.Scanner;

public class visa01 {
    public static void main(String arg[]){
        Scanner scanner = new Scanner(System.in);
        int[][] q = {{0, 2}, {1,5}, {0,9}, {2,15}};
        int[][] q1 = {{0, 2}, {1,3}, {0,7}};
        int[][] q2 = {{0, 1}, {0, 3}, {4, 5}, {5, 6}, {4, 10}};
        getSlowestKeyPress(q2);
    }

    private static void getSlowestKeyPress(int[][] a) {
        int n = a.length;
        char sChar = (char)(a[0][0]+97);
        int max = a[0][1];
        for (int i=1; i<n; i++){
            int temp = a[i][1] - a[i-1][1];
            if (max < temp)
                sChar = (char)(a[i][0]+97);
        }
        System.out.println(sChar);
    }
}
