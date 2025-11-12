
package phone.kay.pads;

import java.util.Scanner;

public class PhoneKayPads {
    public static void main(String[] args) {
  Scanner input=new Scanner (System.in);
        System.out.println("Enter a letter");
        String s=input.next().toUpperCase();
        char letter=s.charAt(0);
        int number=0;
        if (letter>='A'&&letter<='C')
         number=2;
        else if (letter>='D'&&letter<='F')
            number=3;
                else if (letter>='G'&&letter<='I')
            number=4;
                else if (letter>='J'&&letter<='L')
            number=5;
                else if (letter>='M'&&letter<='O')
            number=6;
                else if (letter>='P'&&letter<='S')
            number=7;
                else if (letter>='T'&&letter<='V')
            number=8;
                else if (letter>='W'&&letter<='Z')
            number=9;
        else{
                    System.out.println(letter+"is an anvalid input");
                    System.exit(0);
                }System.out.println("the corresponding number is "+number);
    }
    
}
