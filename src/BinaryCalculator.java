public class BinaryCalculator {
    public static int minimumSteps(int a, int b){
        int minSteps = 0;
        if (a==b)
            return minSteps;
        else if (a<b){
            int diff = b - a;
            minSteps = diff/3;
            int rem = diff%3;
            minSteps += rem*2;
            return minSteps;
        }
        else {
            int diff = a-b;
            minSteps = diff/2;
            int rem = diff%2;
            minSteps += rem*3;
            return minSteps;

        }
    }
    public static void main (String args[]) {
        System.out.println(minimumSteps(90,87));
    }
}
