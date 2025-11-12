
package process.a.string;

import java.util.Scanner;

public class ProcessAString {
    public static void main(String[] args) {
    Scanner input=new Scanner (System.in);
        System.out.println("Enter a string");
        String s=input.nextLine();
        System.out.println("length"+s.length());
        System.out.println("first character"+s.charAt(0));
    }
    
}
