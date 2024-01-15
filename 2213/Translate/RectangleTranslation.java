public class RectangleTranslation {
    public static void translateRectangle(int[][] P, int[] T) {
        for (int i = 0; i < P.length; i++) {
            P[i][0] += T[0]; // Translate x coordinate of vertex i
            P[i][1] += T[1]; // Translate y coordinate of vertex i
        }
    }

    public static void main(String[] args) {
        int[][] rectangle = {{2, 3}, {5, 3}, {5, 7}, {2, 7}}; // Coordinates of the rectangle's vertices (in order)
        int[] translationVector = {5, 5}; // Translation vector (tx, ty)

        System.out.println("Original Rectangle:");
        printRectangle(rectangle);
        translateRectangle(rectangle, translationVector);
        System.out.println("Translated Rectangle:");
        printRectangle(rectangle);
    }

    private static void printRectangle(int[][] rectangle) {
        for (int i = 0; i < rectangle.length; i++) {
            System.out.println("(" + rectangle[i][0] + ", " + rectangle[i][1] + ")");
        }
    }
}
