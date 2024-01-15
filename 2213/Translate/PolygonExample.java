import java.awt.*;
import java.util.Arrays;

public class PolygonExample {
    public static void main(String[] args) {
        // Define a polygon with 4 points
        int[] xPoints = {100, 150, 200, 150};
        int[] yPoints = {100, 50, 100, 150};
        int nPoints = 4;

        // Create a polygon object
        Polygon polygon = new Polygon(xPoints, yPoints, nPoints);

        // Print original polygon points
        System.out.println("Original Polygon: " + Arrays.toString(xPoints) + ", " + Arrays.toString(yPoints));

        // Translate the polygon
        int deltaX = 20;
        int deltaY = 30;
        translatePolygon(polygon, deltaX, deltaY);

        // Print translated polygon points
        System.out.println("Translated Polygon: " + Arrays.toString(polygon.xpoints) + ", " + Arrays.toString(polygon.ypoints));
    }

    public static void translatePolygon(Polygon polygon, int deltaX, int deltaY) {
        // Translate each point of the polygon
        for (int i = 0; i < polygon.npoints; i++) {
            polygon.xpoints[i] += deltaX;
            polygon.ypoints[i] += deltaY;
        }
    }
}
