
package check.substring;

import java.util.Scanner;

public class CheckSubstring {
    public static void main(String[] args) {
    Scanner input=new Scanner (System.in);
        System.out.println("Enter string 1");
        String first=input.nextLine();
        System.out.println("Enter string second");
        String second=input.nextLine();
        if (first.contains(second))
            System.out.println("second is a substring of first"+first);
        else
            System.out.println(second+"is not a substring of "+first);
    }
    
}
