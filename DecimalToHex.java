
package decimal.to.hex;

import java.util.Scanner;

public class DecimalToHex {
    public static void main(String[] args) {
    Scanner input=new Scanner (System.in);
        System.out.println("Enter a dicimal value0 to 15");
        int dicimal=input.nextInt();
        if(dicimal>=0&&dicimal<=9){
            System.out.println("the hex value is "+dicimal);
        }else if (dicimal>=10&&dicimal>=15){
            System.out.println("the hex value is "+(char)(dicimal-10+'A'));
        }else
            System.out.println("the hax value is invalid input");
    }
    
}
