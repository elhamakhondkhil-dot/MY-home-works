
package pkgif.stetment;

import java.util.Scanner;

public class IfStetment {
    public static void main(String[] args) {
Scanner input=new Scanner (System.in);
double score=input.nextDouble();
if (score>=90)
            System.out.println("A");
else if (score>=80)System.out.println("B");
else if (score>=70)System.out.println("C");
else if (score>=60)System.out.println("D");
else if (score>=50)System.out.println("E");
else System.out.println("F");

    }
    
}
