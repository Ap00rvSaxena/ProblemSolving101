package IMC;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Artifacts {
    public static Scanner scanner;
    public static void main(String[] args){
        scanner = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        //int T = scanner.nextInt();
        int n = 4;
        int n1= 3;
        int n2 = 12;
        String artificats = "1B 2C,2D 4D";
        String searched = "2B 2D 3D 4D 4A";
        String artificats1 = "1A 1B,2C 2C";
        String searched1 = "1B";
        String artificats2 = "1A 2B,3C 4C,12A 12A";
        String searched2 = "12A";
        System.out.print("Ans: " + Arrays.toString(solution(n, artificats, searched)) + "\n");
        System.out.print("Ans: " + Arrays.toString(solution(n1, artificats1, searched1)) + "\n");
        System.out.print("Ans: " + Arrays.toString(solution(n2, artificats2, searched2)) + "\n");
        /*
        for(int j=1; j<=T; j++){
            int n = scanner.nextInt();
            String artificats = scanner.next();
            String searched = scanner.next();

            long start = System.currentTimeMillis();

            System.out.print("Case #"+ j +": ");
            testcase(artificats, searched);

            long end = System.currentTimeMillis();
            NumberFormat formatter = new DecimalFormat("#0.00000");
            System.out.println("Execution time is " + formatter.format((end - start) / 1000d) + " seconds");
        }
        */
    }

    public static int[] splitPosition(String s){
        int[] pos = new int[2];
        int len = s.length();
        pos[0] = Integer.valueOf(s.substring(0,len-1)) -1;
        pos[1] = s.charAt(len-1) - 'A';
        return pos;
    }

    public static void createMatrix(int n, int[][] mat, int[] freq, int totalArtifactCount, String[]  artifacts){
        for (int k=0; k<totalArtifactCount; k++) {
            String[] pos = artifacts[k].split(" ");
//            System.out.println("k : " + k + " Pos: " + Arrays.toString(pos));
            int[] numPosStart = splitPosition(pos[0]);
            int[] numPosEnd = splitPosition(pos[1]);
            int rowStart = numPosStart[0];
            int colStart = numPosStart[1];
            int rowEnd = numPosEnd[0];
            int colEnd = numPosEnd[1];
//            System.out.println("(" + rowStart +" - " + colStart +" ) * ( " + rowEnd + " - "+ colEnd +" )");
            freq[k] = (rowEnd - rowStart + 1) * (colEnd - colStart + 1);
            for (int i = rowStart; i <= rowEnd; i++) {
                for (int j = colStart; j <= colEnd; j++) {
                    mat[i][j] = k+1;
                }
            }
        }

        for (int[] i : mat){
            System.out.println(Arrays.toString(i));
        }
        System.out.println(Arrays.toString(freq));


    }

    public static int[] solution(int n, String art, String s) {
        int[] count = new int[2];

        String[] artifacts = art.split(",");
        String[] search = s.split(" ");

        int totalArtifactCount = artifacts.length;
        int[] freq = new int[totalArtifactCount];
        int[][] mat = new int[n][n];
        int[] freqAfterSearch = Arrays.copyOf(freq, totalArtifactCount);
        createMatrix(n, mat, freq, totalArtifactCount, artifacts);
        for (String pos : search){
            int[] numPos = splitPosition(pos);
            int row = numPos[0];
            int col = numPos[1];
            if (mat[row][col] != 0){
                freqAfterSearch[mat[row][col]-1]++;
                mat[row][col] = -1;
            }

        }

        System.out.println("After search: ");
        for (int[] i : mat){
            System.out.println(Arrays.toString(i));
        }
        System.out.println(Arrays.toString(freqAfterSearch));


        for (int i=0; i<totalArtifactCount; i++){
            if (Math.abs(freqAfterSearch[i] - freq[i]) == 0)
                count[0]++;
            else if (freqAfterSearch[i] > 0)
                count[1]++;
        }
        return count;
    }
}
