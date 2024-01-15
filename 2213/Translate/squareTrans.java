public class squareTrans {
    public static void main(String[] args) {
        // Define the initial square
        int initialX = 5;
        int initialY = 5;
        int size = 10;

        // Print initial coordinates
        System.out.println("Initial Square:");
        System.out.println("Top-left corner: (" + initialX + ", " + initialY + ")");
        System.out.println("Size: " + size);

        // Translate the square
        int dx = 3;
        int dy = 2;
        squareTranslate(initialX, initialY, size, dx, dy);

        // Print translated coordinates
        System.out.println("\nTranslated Square:");
        System.out.println("Top-left corner: (" + (initialX + dx) + ", " + (initialY + dy) + ")");
        System.out.println("Size: " + size);
    }

    private static void squareTranslate(int x, int y, int size, int dx, int dy) {
        // Translate the square by adding dx and dy to its coordinates
        int translatedX = x + dx;
        int translatedY = y + dy;

        // Print the translation information
        System.out.println("\nTranslating the square by (" + dx + ", " + dy + ")");
    }
}
