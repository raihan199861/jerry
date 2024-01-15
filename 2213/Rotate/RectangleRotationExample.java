import java.awt.geom.Rectangle2D;
import java.awt.geom.Point2D;

public class RectangleRotationExample {
    public static void main(String[] args) {
        // Create a rectangle
        Rectangle2D.Double rectangle = new Rectangle2D.Double(1, 1, 4, 3);
        System.out.println("Original Rectangle: " + rectangle);

        // Rotate the rectangle by 45 degrees around the center
        rotateRectangle(rectangle, 45);
        System.out.println("Rotated Rectangle: " + rectangle);
    }

    public static void rotateRectangle(Rectangle2D.Double rectangle, double angleDegrees) {
        // Calculate the center of the rectangle
        double centerX = rectangle.getCenterX();
        double centerY = rectangle.getCenterY();

        // Create a Point2D representing the center
        Point2D.Double center = new Point2D.Double(centerX, centerY);

        // Rotate each corner of the rectangle around the center
        rotatePoint(rectangle.x, rectangle.y, center, angleDegrees);
        rotatePoint(rectangle.x + rectangle.width, rectangle.y, center, angleDegrees);
        rotatePoint(rectangle.x + rectangle.width, rectangle.y + rectangle.height, center, angleDegrees);
        rotatePoint(rectangle.x, rectangle.y + rectangle.height, center, angleDegrees);
    }

    public static void rotatePoint(double x, double y, Point2D.Double center, double angleDegrees) {
        // Convert angle from degrees to radians
        double angleRadians = Math.toRadians(angleDegrees);

        // Translate point so that the center becomes the origin
        x -= center.x;
        y -= center.y;

        // Perform rotation using rotation matrix
        double newX = x * Math.cos(angleRadians) - y * Math.sin(angleRadians);
        double newY = x * Math.sin(angleRadians) + y * Math.cos(angleRadians);

        // Translate the point back to its original position
        x = newX + center.x;
        y = newY + center.y;
    }
}
