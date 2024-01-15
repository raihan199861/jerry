public class Circle {
    private double x;
    private double y;
    private double radius;

    public Circle(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public void translateCircle(double deltaX, double deltaY) {
        x += deltaX;
        y += deltaY;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public static void main(String[] args) {
        Circle circle = new Circle(0, 0, 5); // Create a circle at (0, 0) with radius 5
        System.out.println("Original position: (" + circle.getX() + ", " + circle.getY() + ")");

        circle.translateCircle(2, 3); // Translate the circle by (2, 3)
        System.out.println("New position: (" + circle.getX() + ", " + circle.getY() + ")");
    }
}
