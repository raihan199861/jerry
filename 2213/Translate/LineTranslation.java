public class LineTranslation {
    public static void translateLine(int[][] P, int[] T) {
        for (int i = 0; i < P.length; i++) {
            P[i][0] += T[0]; // Translate x coordinate of endpoint i
            P[i][1] += T[1]; // Translate y coordinate of endpoint i
        }
    }

    public static void main(String[] args) {
        int[][] line = {{2, 3}, {5, 7}}; // Coordinates of the line's endpoints: (x1, y1), (x2, y2)
        int[] translationVector = {5, 5}; // Translation vector (tx, ty)

        System.out.println("Original Line: (" + line[0][0] + ", " + line[0][1] + ") - (" + line[1][0] + ", " + line[1][1] + ")");
        translateLine(line, translationVector);
        System.out.println("Translated Line: (" + line[0][0] + ", " + line[0][1] + ") - (" + line[1][0] + ", " + line[1][1] + ")");
    }
}
