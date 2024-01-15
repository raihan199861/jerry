import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.List;

public class PolygonRotationExample {
    public static void main(String[] args) {
        // Create a polygon represented by a list of points
        List<Point2D.Double> polygon = new ArrayList<>();
        polygon.add(new Point2D.Double(1, 1));
        polygon.add(new Point2D.Double(2, 1));
        polygon.add(new Point2D.Double(2, 2));
        polygon.add(new Point2D.Double(1, 2));
        System.out.println("Original Polygon: " + polygon);

        // Rotate the polygon by 90 degrees clockwise around the origin
        rotatePolygon(polygon, 90);
        System.out.println("Rotated Polygon: " + polygon);
    }

    public static void rotatePolygon(List<Point2D.Double> polygon, double angleDegrees) {
        // Convert angle from degrees to radians
        double angleRadians = Math.toRadians(angleDegrees);

        // Calculate the center of the polygon
        double centerX = 0;
        double centerY = 0;
        for (Point2D.Double point : polygon) {
            centerX += point.getX();
            centerY += point.getY();
        }
        centerX /= polygon.size();
        centerY /= polygon.size();

        // Rotate each point of the polygon around the center
        for (Point2D.Double point : polygon) {
            double x = point.getX() - centerX;
            double y = point.getY() - centerY;
            double newX = x * Math.cos(angleRadians) - y * Math.sin(angleRadians);
            double newY = x * Math.sin(angleRadians) + y * Math.cos(angleRadians);
            point.setLocation(newX + centerX, newY + centerY);
        }
    }
}
