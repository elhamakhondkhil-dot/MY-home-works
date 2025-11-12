
package geometryarea.of.a.pentagon;

import java.util.Scanner;

public class GeometryAreaOfAPentagon {
    public static void main(String[] args) {
    Scanner input=new Scanner (System.in);
        System.out.println("Enter the leanth from the center to the vertex ");
        double r=input.nextDouble();
        double s=2*r*Math.sin(Math.PI/5);
        double area=(5*Math.pow(s, 2))/(4*Math.tan(Math.PI/5));
        System.out.println("the aera of the pentagonis ="+area);
        
    
    }
    
}
