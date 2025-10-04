
package convert.feet.into.meters;

import java.util.Scanner;

public class ConvertFeetIntoMeters {
    public static void main(String[] args) {
 Scanner input=new Scanner (System.in);
        System.out.println("Enter a value for feet");
       double feet= input.nextDouble();
       double meter=(0.305)* feet;
        System.out.println("feet "+meter+" meter");
       
        
     
    }
    
}
