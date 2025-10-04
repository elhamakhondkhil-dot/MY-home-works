
package bmi.calcuting;

import java.util.Scanner;

public class BmiCalcuting {
    public static void main(String[] args) {
    Scanner input=new Scanner (System.in);
        System.out.println("Enter your wight in pounds");
    double wight=input.nextDouble();
        System.out.println("Enter your hight in inches");
        double hight=input.nextDouble();
        double BMI=wight/hight*hight;
        System.out.println("BMI is "+BMI);
    
    }
    
}
