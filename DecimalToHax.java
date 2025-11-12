
package decimal.to.hax;

import java.util.Scanner;

public class DecimalToHax {
    public static void main(String[] args) {
    Scanner input=new Scanner (System.in);
        System.out.println("enter a decimal value (0 to 15)");
        int decimal=input.nextInt();
        if (decimal>=00&&decimal<=9)
            System.out.println("the hax value is "+decimal);
        else if (decimal>=10&&decimal<=15)
            System.out.println("the hax value is"+(char)(decimal-10+'a'));
        else
            System.out.println(decimal+"is an invalid input");
    }
    
}
