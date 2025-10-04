
package finding.runway.length;

import java.util.Scanner;

public class FindingRunwayLength {
    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
        System.out.println("Enter v in m/s");
        double v=input.nextDouble();
        System.out.println("Entetr a in m/sec*sec");
        double a=input.nextDouble();
        double Length=(v*v)/(2*a);
        System.out.println("The minimum runway length for this airplane is "+Length);
    }
    
}
