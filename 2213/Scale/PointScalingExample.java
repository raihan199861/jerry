import java.awt.geom.Point2D;

public class PointScalingExample {
    public static void main(String[] args) {
        // Create a point
        Point2D.Double point = new Point2D.Double(3, 4);
        System.out.println("Original Point: (" + point.getX() + ", " + point.getY() + ")");

        // Scale the point by a factor of 2
        scalePoint(point, 2);
        System.out.println("Scaled Point: (" + point.getX() + ", " + point.getY() + ")");
    }

    public static void scalePoint(Point2D.Double point, double scaleFactor) {
        // Scale the coordinates of the point
        point.setLocation(point.getX() * scaleFactor, point.getY() * scaleFactor);
    }
}
