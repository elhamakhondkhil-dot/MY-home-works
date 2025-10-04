
package convert.pounds.into.the.kilo.gram;

import java.util.Scanner;

public class ConvertPoundsIntoTheKiloGram {
    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
        System.out.println("Enter a value for founds");
        double pounds=input.nextDouble();
        double kilogram=(0.454)*pounds;
        System.out.println("pounds"+kilogram+"iskilogram");
    }
    
}
