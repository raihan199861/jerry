import java.awt.geom.Point2D;

public class TriangleScalingExample {
    public static void main(String[] args) {
        // Create a triangle represented by three points
        Point2D.Double point1 = new Point2D.Double(0, 0);
        Point2D.Double point2 = new Point2D.Double(1, 0);
        Point2D.Double point3 = new Point2D.Double(0, 1);
        System.out.println("Original Triangle: (" + point1.getX() + ", " + point1.getY() + "), ("
                + point2.getX() + ", " + point2.getY() + "), (" + point3.getX() + ", " + point3.getY() + ")");

        // Scale the triangle by a factor of 2
        scaleTriangle(point1, point2, point3, 2);
        System.out.println("Scaled Triangle: (" + point1.getX() + ", " + point1.getY() + "), ("
                + point2.getX() + ", " + point2.getY() + "), (" + point3.getX() + ", " + point3.getY() + ")");
    }

    public static void scaleTriangle(Point2D.Double point1, Point2D.Double point2, Point2D.Double point3,
            double scaleFactor) {
        // Scale each point of the triangle
        point1.setLocation(point1.getX() * scaleFactor, point1.getY() * scaleFactor);
        point2.setLocation(point2.getX() * scaleFactor, point2.getY() * scaleFactor);
        point3.setLocation(point3.getX() * scaleFactor, point3.getY() * scaleFactor);
    }
}
