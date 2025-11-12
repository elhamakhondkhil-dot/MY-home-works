
package convert.letter.to.grade;

import java.util.Scanner;

public class ConvertLetterToGrade {
    public static void main(String[] args) {
    Scanner input=new Scanner (System.in);
        System.out.println("enter a letter grade ");
        String s=input.next().toUpperCase();
        char grade=s.charAt(0);
        int value=0;
        if (grade=='A')
            value=4;
        else if (grade=='B')
            value=3;
        else if (grade=='C')
            value=2;
        else if (grade=='D')
            value=1;
        else if (grade=='F')
            value=0;
        else{
            System.out.println(grade+"is an invalid input");
            System.exit(0);
        }System.out.println("the numeric value for grade"+grade+"is "+value);
        
    }
    
}
