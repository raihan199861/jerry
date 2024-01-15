public class Triangle {
    private double x1, y1, x2, y2, x3, y3;

    public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
    }

    public void translateTriangle(double deltaX, double deltaY) {
        x1 += deltaX;
        y1 += deltaY;
        x2 += deltaX;
        y2 += deltaY;
        x3 += deltaX;
        y3 += deltaY;
    }

    public void printCoordinates() {
        System.out.println("Triangle coordinates:");
        System.out.println("Vertex 1: (" + x1 + ", " + y1 + ")");
        System.out.println("Vertex 2: (" + x2 + ", " + y2 + ")");
        System.out.println("Vertex 3: (" + x3 + ", " + y3 + ")");
    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle(0, 0, 1, 0, 0, 1); // Create a triangle
        triangle.printCoordinates(); // Print original coordinates

        triangle.translateTriangle(2, 3); // Translate the triangle by (2, 3)
        triangle.printCoordinates(); // Print new coordinates
    }
}
