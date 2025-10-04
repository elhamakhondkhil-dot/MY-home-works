
package calculating.eneragy;

import java.util.Scanner;

public class CalculatingEneragy {
    public static void main(String[] args) {
    Scanner input= new Scanner (System.in);
        System.out.println("Enter the amount of wather in kilo gram");
        double amountofwater=input.nextDouble();
        System.out.println("Enter the initial tempeature");
        double initialtemperature=input.nextDouble();
        System.out.println("Enter the final tempeature ");
        double finaltemperature=input.nextDouble();
        double enargy= (amountofwater)*(finaltemperature-initialtemperature)*4184;
        System.out.println("The eneragy needed is"+enargy);
    }
    
}
