
package find.the.numer.of.the.years;

import java.util.Scanner;

public class FindTheNumerOfTheYears {
    public static void main(String[] args) {
    Scanner input=new Scanner (System.in);
        System.out.println("Enter minutes");
        long minutes=input.nextLong();
        long houres=minutes/60;
         minutes=minutes%60;
        long days=houres/24;
        long months=days /30;
        long year=months /12;
        System.out.println("the numer of the year is="+year);
    }
    
}
