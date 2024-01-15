import java.awt.geom.Point2D;

public class LineScalingExample {
    public static void main(String[] args) {
        // Create a line represented by two points
        Point2D.Double startPoint = new Point2D.Double(1, 1);
        Point2D.Double endPoint = new Point2D.Double(4, 5);
        System.out.println("Original Line: (" + startPoint.getX() + ", " + startPoint.getY() + ") to ("
                + endPoint.getX() + ", " + endPoint.getY() + ")");

        // Scale the line by a factor of 2
        scaleLine(startPoint, endPoint, 2);
        System.out.println("Scaled Line: (" + startPoint.getX() + ", " + startPoint.getY() + ") to ("
                + endPoint.getX() + ", " + endPoint.getY() + ")");
    }

    public static void scaleLine(Point2D.Double start, Point2D.Double end, double scaleFactor) {
        // Calculate the new coordinates for the end point based on the scale factor
        double newX = start.getX() + (end.getX() - start.getX()) * scaleFactor;
        double newY = start.getY() + (end.getY() - start.getY()) * scaleFactor;

        // Update the end point with the new coordinates
        end.setLocation(newX, newY);
    }
}
