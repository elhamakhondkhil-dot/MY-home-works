
package days.of.amonth;

import java.util.Scanner;

public class DaysOfAmonth {
    public static void main(String[] args) {
     Scanner input=new Scanner (System.in);
        System.out.println("Enter a year");
        int year=input.nextInt();
         System.out.println("Enter a month ");
        String months=input.next();
        int days=0;
        if (months.equals("Jan")||months.equals("Mar")||months.equals("May")||months.equals("Jul")||months.equals("Aug")||months.equals("Oct")||months.equals("Dec")){
            days=31;
        } else if (months.equals("Apr")||months.equals("Jun")||months.equals("Sep")||months.equals("Nov")){
            days=30;
        } else if (months.equals("Fab")){
            if (year%400==0||year%4==0&&year%100!=0)
                days=29;
        }else {
            System.out.println(" invalid month input");
            System.exit(0);
        } System.out.println(months+""+year+"has"+days+"days");
        
    }
    
}
