import java.awt.geom.Rectangle2D;

public class RectangleScalingExample {
    public static void main(String[] args) {
        // Create a rectangle
        Rectangle2D.Double rectangle = new Rectangle2D.Double(1, 1, 4, 3);
        System.out.println("Original Rectangle: " + rectangle);

        // Scale the rectangle by a factor of 2
        scaleRectangle(rectangle, 2);
        System.out.println("Scaled Rectangle: " + rectangle);
    }

    public static void scaleRectangle(Rectangle2D.Double rectangle, double scaleFactor) {
        // Scale the width and height of the rectangle
        rectangle.width *= scaleFactor;
        rectangle.height *= scaleFactor;
    }
}
