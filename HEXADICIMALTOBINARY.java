
package hexadicimal.to.binary;

import java.util.Scanner;

public class HEXADICIMALTOBINARY {
    public static void main(String[] args) {
    Scanner input=new Scanner (System.in);
        System.out.println("Enter a hex digit 0 to 9 or Ato F");
        String hex=input.next().toUpperCase();
        char ch=hex.charAt(0);
        if(ch>='0'&&ch<='9'){
            int value=ch-'0';
            System.out.println("The binary value is "+Integer.toBinaryString(value));
        }else if (ch>='A'&&ch<='F'){
            int value=ch-'A'+10;
            System.out.println("the binary value is "+Integer.toBinaryString(value));
        }else
            System.out.println(ch+"is an invalid input");
    }
    
}
