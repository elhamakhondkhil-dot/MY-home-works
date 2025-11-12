
package random.points.on.a.circle;
public class RandomPointsOnACircle {
    public static void main(String[] args) {
    double r= 40;
    double angle1=Math.random()*2*Math.PI;
    double angle2=Math.random()*2*Math.PI;
    double angle3=Math.random()*2*Math.PI;
    double x1=r*Math.cos(angle1);
    double y1=r*Math.sin(angle1);
        double x2=r*Math.cos(angle2);
    double y2=r*Math.sin(angle2);
        double x3=r*Math.cos(angle3);
    double y3=r*Math.sin(angle3);
        System.out.println("point1,x1,y1");
        System.out.println("point2:x2,y2");
        System.out.println("point3:x3,y3");
    
    }
    
}
