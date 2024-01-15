import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.List;

public class PolygonScalingExample {
    public static void main(String[] args) {
        // Create a polygon represented by a list of points
        List<Point2D.Double> polygon = new ArrayList<>();
        polygon.add(new Point2D.Double(1, 1));
        polygon.add(new Point2D.Double(2, 1));
        polygon.add(new Point2D.Double(2, 2));
        polygon.add(new Point2D.Double(1, 2));
        System.out.println("Original Polygon: " + polygon);

        // Scale the polygon by a factor of 2
        scalePolygon(polygon, 2);
        System.out.println("Scaled Polygon: " + polygon);
    }

    public static void scalePolygon(List<Point2D.Double> polygon, double scaleFactor) {
        // Scale each point of the polygon
        for (Point2D.Double point : polygon) {
            point.setLocation(point.getX() * scaleFactor, point.getY() * scaleFactor);
        }
    }
}
