
package acceleration;

import java.util.Scanner;

public class Acceleration {
    public static void main(String[] args) {
    Scanner input= new Scanner(System.in);
        System.out.println("Enter starting volecity in m/sec and the ending volacity in m/s and the time spaent in sec");
        double v1=input.nextDouble();
        double v0=input.nextDouble();
        double t=input.nextDouble();
        double a= (v1-v0)/t;
        System.out.println("The avarege of Acceleration is"+a);
    }
    
}
