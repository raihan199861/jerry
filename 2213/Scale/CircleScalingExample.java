import java.awt.geom.Point2D;

public class CircleScalingExample {
    public static void main(String[] args) {
        // Create a circle
        Point2D.Double center = new Point2D.Double(2, 2);
        double radius = 3;
        System.out.println("Original Circle: Center(" + center.getX() + ", " + center.getY() + "), Radius = " + radius);

        // Scale the circle by a factor of 2
        scaleCircle(center, radius, 2);
        System.out.println("Scaled Circle: Center(" + center.getX() + ", " + center.getY() + "), Radius = " + radius);
    }

    public static void scaleCircle(Point2D.Double center, double radius, double scaleFactor) {
        // Scale the radius of the circle
        radius *= scaleFactor;
    }
}
