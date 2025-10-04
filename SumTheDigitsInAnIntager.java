
package sum.the.digits.in.an.intager;

import java.util.Scanner;

public class SumTheDigitsInAnIntager {
    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
        System.out.println("Enter a number between 0 and 1000");
        int number=input.nextInt();
        int digit1= number %10;
        number=number/10;
        int digit2=number%10;
        number=number/10;
        int digit3=number%10;
        number=number/10;
        int sum=digit1+digit2+digit3;
        System.out.println("The sum of the three digit="+sum);
        
    }
    
}
