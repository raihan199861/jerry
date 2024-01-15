import java.awt.geom.Point2D;

public class PointRotationExample {
    public static void main(String[] args) {
        // Create a point
        Point2D.Double point = new Point2D.Double(3, 4);
        System.out.println("Original Point: (" + point.getX() + ", " + point.getY() + ")");

        // Rotate the point by 90 degrees clockwise around the origin
        rotatePoint(point, 90);
        System.out.println("Rotated Point: (" + point.getX() + ", " + point.getY() + ")");
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
