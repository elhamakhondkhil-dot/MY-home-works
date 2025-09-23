
package exicise8.converting;

import java.util.Scanner;


public class Exicise8Converting {

    
    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
        System.out.println("Enter a Farnhiet dagree");
        double Fahrenheit=input.nextDouble();
      double  Celusius=(5.0/9)*(Fahrenheit-32);
        System.out.println("Fahrenheit="+Fahrenheit+"in Celusius"+Celusius);
        
    }
    
}
