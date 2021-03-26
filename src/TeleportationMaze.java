import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

class QItem {
    public
    int row;
    int col;
    int dist;

    QItem(int x, int y, int w) {
        row = x;
        col = y;
        dist = w;
    }
}

    public class TeleportationMaze {
    public int pathLength(String[] a, int r1, int c1, int r2, int c2){
        QItem source = new QItem(r1, r2, 0);
        int N = a.length;
        int M = a[0].length();
        boolean[][] visited = new boolean[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++)
            {
                if (a[i].charAt(j) == '#')
                    visited[i][j] = true;
                else
                    visited[i][j] = false;
            }
        }
        Queue<QItem> q = new LinkedList<>();


        return -1;
    }
}
