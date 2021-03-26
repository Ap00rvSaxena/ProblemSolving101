import java.util.*;

class Pair<A, B> {
    private A first;
    private B second;

    public Pair(A first, B second) {
        super();
        this.first = first;
        this.second = second;
    }

    public A getFirst() {
        return first;
    }

    public B getSecond() {
        return second;
    }
}

public class ORMATRIX {
    public static void main(String arg[]){
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T-- > 0){
            int n, m;
            int count1 = 0, count0 = 0;
            n = scanner.nextInt();
            m = scanner.nextInt();
            int[][] arr = new int[n][m];
            int[][] nativearr = new int[n][m];
            ArrayList <Pair <Integer,Integer> > mp = new ArrayList <Pair <Integer,Integer> > ();
            for (int i=0; i<n; i++){
                String temp = scanner.next();
                for (int j=0; j<m; j++){
                    arr[i][j] = Integer.parseInt(String.valueOf(temp.charAt(j)));
                    nativearr[i][j] = arr[i][j];
                    if (arr[i][j] == 1){
                        count1++;
                        mp.add(new Pair<>(i,j));
                    }
                    else
                        count0++;
                }
            }
            int count = 1;
            if (count1 ==0){
                for (int i=0; i<n; i++){
                    for (int j=0; j<m; j++){
                        System.out.print(-1 + " ");
                    }
                    System.out.println();
                }
            }
            else {
                while (count0 != 0){
                    ArrayList <Pair <Integer,Integer> > mpnew = new ArrayList <> ();
                    for (int j=0; j<mp.size(); j++){
                        Pair <Integer,Integer> pair = mp.get(j);
                        int r = pair.getFirst();
                        int c = pair.getSecond();
                        for (int i=0; i<m; i++){
                            if (arr[r][i] == 0){
                                arr[r][i] = count;
                                count0--;
                                if ( i != c)
                                    mpnew.add( new Pair<>(r, i));
                            }
                        }
                        for (int i=0; i<n; i++){
                            if (arr[i][c] == 0){
                                arr[i][c] = count;
                                count0--;
                                if ( i != r)
                                mpnew.add( new Pair<>(i, c));
                            }
                        }
                    }
                    mp = mpnew;
                    count++;
                }
                for (int i=0; i<n; i++){
                    for (int j=0; j<m; j++){
                        if (nativearr[i][j] == 1)
                            System.out.print(0 + " ");
                        else
                            System.out.print(arr[i][j] + " ");
                    }
                    System.out.println();
                }
            }
            }
        }
    }
