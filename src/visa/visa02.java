package visa;

import java.util.Scanner;

public class visa02 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        Car car = new Car();
        car.printTopSpeed();
        car.printTopSpeed(200);
        car.printTopSpeed("BMW", 220);
        car.printTopSpeed(300);
    }

}

class Car{

    public void printTopSpeed(){
        System.out.println("Top speed of the vehicle is 100 kmph");
    }

    public void printTopSpeed(int topSpeed){
        System.out.println("Top speed of the vehicle is " + topSpeed +" kmph");
    }

    public void printTopSpeed(String v , int topSpeed){
        System.out.println("Top speed of the vehicle " + v + " is " + topSpeed + " kmph");
    }
}
