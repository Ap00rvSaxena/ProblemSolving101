import java.util.Scanner;

class landingStatus {
    public enum landing { deployChute, releaseChute, descend, none};

}
public class HW3{
    public landingStatus.landing landCraft(boolean landing, double altitude, double speed){
        landingStatus.landing action = landingStatus.landing.none;
        if (landing)
            if (altitude > 5000.0){
                if (speed < 500.0)
                    if (speed >=200.0)
                        action = landingStatus.landing.deployChute;
            }
            else {
                if (altitude >= 2500.0){
                    if (speed < 200.0)
                        if (speed > 100.0)
                            action = landingStatus.landing.releaseChute;
                }
            }
            else
                action = landingStatus.landing.descend;
        return action;
    }

    public static void main(String[] args){
        int T;
        Scanner scanner = new Scanner(System.in);
        T = scanner.nextInt();
        HW3 obj = new HW3();
        while (T-->0){
          boolean landing = scanner.nextBoolean();
          double altitude = scanner.nextDouble();
          double speed = scanner.nextDouble();
          System.out.println(obj.landCraft(landing, altitude, speed));
        }
    }
}

