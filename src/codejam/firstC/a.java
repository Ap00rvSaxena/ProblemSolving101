package codejam.firstC;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.*;

class Solution {
    static int minTime;
    static class Pair{
        long x, y;

        public Pair(long x, long y){
            this.x = x;
            this.y = y;
        }

        public String toString(){
            return this.x + "=" + this.y;
        }

        public long getX(){
            return this.x;
        }

        public long getY(){
            return this.y;
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int T = scanner.nextInt();
        for(int i=1; i<=T; i++){
            minTime = Integer.MAX_VALUE;
            long x = scanner.nextLong();
            long y = scanner.nextLong();
            String m = scanner.next();
            //long start = System.currentTimeMillis();

            System.out.print("Case #"+ i +": ");
            testcase(x, y, m);

//            long end = System.currentTimeMillis();
//            NumberFormat formatter = new DecimalFormat("#0.00000");
//            System.out.println("Execution time is " + formatter.format((end - start) / 1000d) + " seconds");
        }
    }

    public static void testcase(long x, long y, String m) {
        int n = m.length();
        HashMap<Integer, Pair> mapset = new HashMap();
        int[][] dir = {{0, 1},{1, 0},{0, -1},{-1, 0}};
        // N E S W
//        if (x+y > n){
//            System.out.print("Set: \n");
//        }
        for (int i=0; i<n; i++){
            int idx = 0;
            if (m.charAt(i) == 'N'){idx =0;}
            if (m.charAt(i) == 'E'){idx =1;}
            if (m.charAt(i) == 'S'){idx =2;}
            if (m.charAt(i) == 'W'){idx =3;}
            x += dir[idx][0];
            y += dir[idx][1];
            //System.out.print("Par Val " + newX+ " , "+ newY+ "\n");
            //Pair<Long, Long> temp = ;
            Pair ptemp = new Pair(x,y);
            mapset.put(i+1, ptemp);
            if (checkPath(ptemp,i+1)){
                System.out.print(i+1 + "\n");
                return;
            }
            //dfs(mapset, new Pair(0,0), 0, n);
        }
        //System.out.print("Set: " + mapset+ "\n");
        System.out.print("IMPOSSIBLE");
        System.out.print("\n");
    }

    private static boolean checkPath(Pair target, int r) {
        if ((Math.abs(target.getX()) + Math.abs(target.getY())) > r)
            return false;
        return true;
    }

}
/*
5
4 4 SSSS
3 0 SNSS
2 10 NSNNSN
0 1 S
2 7 SSSSSSSS

Case #1: 4
Case #2: IMPOSSIBLE
Case #3: IMPOSSIBLE
Case #4: 1
Case #5: 5
 */