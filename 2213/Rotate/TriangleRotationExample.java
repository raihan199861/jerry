import java.awt.geom.Point2D;

public class TriangleRotationExample {
    public static void main(String[] args) {
        // Create a triangle represented by three points
        Point2D.Double point1 = new Point2D.Double(0, 0);
        Point2D.Double point2 = new Point2D.Double(1, 0);
        Point2D.Double point3 = new Point2D.Double(0, 1);
        System.out.println("Original Triangle: (" + point1.getX() + ", " + point1.getY() + "), ("
                + point2.getX() + ", " + point2.getY() + "), (" + point3.getX() + ", " + point3.getY() + ")");

        // Rotate the triangle by 90 degrees clockwise around the origin
        rotateTriangle(point1, point2, point3, 90);
        System.out.println("Rotated Triangle: (" + point1.getX() + ", " + point1.getY() + "), ("
                + point2.getX() + ", " + point2.getY() + "), (" + point3.getX() + ", " + point3.getY() + ")");
    }

    public static void rotateTriangle(Point2D.Double point1, Point2D.Double point2, Point2D.Double point3,
            double angleDegrees) {
        // Rotate each point of the triangle around the origin
        rotatePoint(point1, angleDegrees);
        rotatePoint(point2, angleDegrees);
        rotatePoint(point3, angleDegrees);
    }

    public static void rotatePoint(Point2D.Double point, double angleDegrees) {
        // Convert angle from degrees to radians
        double angleRadians = Math.toRadians(angleDegrees);

        // Perform rotation using rotation matrix
        double x = point.getX();
        double y = point.getY();
        double newX = x * Math.cos(angleRadians) - y * Math.sin(angleRadians);
        double newY = x * Math.sin(angleRadians) + y * Math.cos(angleRadians);

        // Update the coordinates of the point
        point.setLocation(newX, newY);
    }
}
