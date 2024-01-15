import java.awt.geom.Point2D;

public class LineRotationExample {
    public static void main(String[] args) {
        // Create a line represented by two points
        Point2D.Double startPoint = new Point2D.Double(1, 1);
        Point2D.Double endPoint = new Point2D.Double(4, 5);
        System.out.println("Original Line: (" + startPoint.getX() + ", " + startPoint.getY() + ") to ("
                + endPoint.getX() + ", " + endPoint.getY() + ")");

        // Rotate the line by 45 degrees clockwise around the midpoint
        rotateLine(startPoint, endPoint, 45);
        System.out.println("Rotated Line: (" + startPoint.getX() + ", " + startPoint.getY() + ") to ("
                + endPoint.getX() + ", " + endPoint.getY() + ")");
    }

    public static void rotateLine(Point2D.Double start, Point2D.Double end, double angleDegrees) {
        // Calculate midpoint of the line
        double midX = (start.getX() + end.getX()) / 2;
        double midY = (start.getY() + end.getY()) / 2;

        // Translate the line so that the midpoint becomes the origin
        end.x -= midX;
        end.y -= midY;
        start.x -= midX;
        start.y -= midY;

        // Convert angle from degrees to radians
        double angleRadians = Math.toRadians(angleDegrees);

        // Perform rotation using rotation matrix
        double newX = start.x * Math.cos(angleRadians) - start.y * Math.sin(angleRadians);
        double newY = start.x * Math.sin(angleRadians) + start.y * Math.cos(angleRadians);
        start.x = newX;
        start.y = newY;

        newX = end.x * Math.cos(angleRadians) - end.y * Math.sin(angleRadians);
        newY = end.x * Math.sin(angleRadians) + end.y * Math.cos(angleRadians);
        end.x = newX;
        end.y = newY;

        // Translate the line back to its original position
        end.x += midX;
        end.y += midY;
        start.x += midX;
        start.y += midY;
    }
}
