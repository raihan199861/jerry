public class PointTranslation {
    public static void translatePoint(int[] P, int[] T) {
        P[0] += T[0]; // Translate x coordinate
        P[1] += T[1]; // Translate y coordinate
    }

    public static void main(String[] args) {
        int[] point = {2, 3}; // Coordinates of the point (x, y)
        int[] translationVector = {5, 5}; // Translation vector (tx, ty)

        System.out.println("Original Point: (" + point[0] + ", " + point[1] + ")");
        translatePoint(point, translationVector);
        System.out.println("Translated Point: (" + point[0] + ", " + point[1] + ")");
    }
}
