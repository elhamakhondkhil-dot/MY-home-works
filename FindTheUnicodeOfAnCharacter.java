
package find.the.unicode.of.an.character;

import java.util.Scanner;

public class FindTheUnicodeOfAnCharacter {
    public static void main(String[] args) {
    Scanner input=new Scanner (System.in);
        System.out.println("Enter a character ");
        char character=input.next().charAt(0);
        int code=(int)character;
        System.out.println("The character for the ascii code you enter is "+code);
    }
    
}
