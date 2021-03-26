package codechef;

import java.util.Scanner;

public class VSN {
    public static void main(String arg[]){
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T-- > 0){
            long px,py,pz, qx, qy,qz, dx, dy,dz, r;
            double countA=0, countB=0;
            px = scanner.nextLong();
            py = scanner.nextLong();
            pz = scanner.nextLong();
            qx = scanner.nextLong();
            qy = scanner.nextLong();
            qz = scanner.nextLong();
            dx = scanner.nextLong();
            dy = scanner.nextLong();
            dz = scanner.nextLong();
            r = scanner.nextLong();
            double b = -2*px*py;
            double a = ((px^2) - (r^2));
            double c = ((py^2) - (r^2));
            double m1, m2;
            m1 = (-b + Math.sqrt((Math.pow(b,2))-(4*a*c)))/(2*a);
            m2 = (-b - Math.sqrt((Math.pow(b,2))-(4*a*c)))/(2*a);
            double A = -m1;
            double B = 1;
            double C = m1*px - py;

            double dis1 = (Math.abs(A*qx+B*qy+C))/(Math.sqrt(Math.pow(A,2) + Math.pow(B, 2)));
            A = -m2;
            C = m2*px - py;
            double dis2 = (Math.abs(A*qx+B*qy+C))/(Math.sqrt(Math.pow(A,2) + Math.pow(B, 2)));

            System.out.println();
        }
    }
    /*2
    5 1 1
    1 1 1 1 1
    2 1 1
    1 2*/
}
