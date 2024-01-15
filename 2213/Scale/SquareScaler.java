import java.awt.Rectangle;

public class SquareScaler {
    public static void main(String[] args) {
        // Create a square (initially a rectangle with equal width and height)
        Rectangle square = new Rectangle(10, 10, 30, 30); // Example square (x, y, width, height)

        // Print the original square
        System.out.println("Original Square: " + square);

        // Scale the square by a factor of 2
        scaleSquare(square, 2);

        // Print the scaled square
        System.out.println("Scaled Square: " + square);
    }

    public static void scaleSquare(Rectangle square, double factor) {
        // Ensure that the rectangle is a square by taking the minimum of width and height
        int sideLength = (int) Math.min(square.getWidth(), square.getHeight());

        // Scale the side length of the square by the factor
        int newSideLength = (int) (sideLength * factor);

        // Set the new width and height to maintain the square shape
        square.setSize(newSideLength, newSideLength);
    }
}
