/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sum.natural.numbers;
import java.util.Scanner;
public class SumNaturalNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.println("Enter n:");
        int n=input.nextInt();
        int sum = n* (n +1)/2;
        System.out.println("Sum of first " + n+ " natural numbers =" + sum);
        input.close();
    }
    
}
