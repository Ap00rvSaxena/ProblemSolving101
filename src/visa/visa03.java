package visa;

import java.util.*;

public class visa03 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        List<Integer> firstDay = new ArrayList<>();
        List<Integer> lastDay = new ArrayList<>();
        //int[] a = {1, 2, 3, 3, 3};
        //int[] b = {2, 2, 3, 4, 4};
        //[1,1],[1,2],[1,3],[1,4],[1,5],[1,6],[1,7]
        int[] a = {1, 1, 1, 1, 1, 1, 1};
        int[] b = {1, 2, 3, 4, 5, 6, 7};
        for(int i=0; i<a.length; i++){
            firstDay.add(a[i]);
            lastDay.add(b[i]);
        }
        countMeetings(firstDay, lastDay);
    }

    private static void countMeetings(List<Integer> f, List<Integer> l) {
        int n = f.size();
        int[][] days = new int[n][2];
        for (int i=0; i<n; i++){
            days[i][0] = f.get(i);
            days[i][1] = l.get(i);
        }
        Arrays.sort(days, (x, y) -> Integer.compare(x[1], y[1]));
        for (int[] d : days)
            System.out.println(Arrays.toString(d));
        Set<Integer> set = new HashSet<>();
        for (int i=0;i<n; i++){
            for (int j=days[i][0]; j<=days[i][1]; j++){
                if (set.add(j))
                    break;
            }
        }
        System.out.println(set.size());
    }
}
