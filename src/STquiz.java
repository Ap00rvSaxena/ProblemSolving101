import java.util.Scanner;

public class STquiz {
    public static void main (String args[]){
        int T;
        Scanner scanner = new Scanner(System.in);
        T = scanner.nextInt();
        while(T-->0){
            int x = scanner.nextInt();
            switch (x%10){
                case 1:
                case 3:
                case 5:
                case 7:
                case 9:
                    System.out.println("Odd");
                    break;
                case 2:
                case 4:
                case 6:
                case 8:
                case 0:
                    System.out.println("Even");
                    break;
            }
        }
    }
}
