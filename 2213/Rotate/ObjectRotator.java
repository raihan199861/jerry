public class ObjectRotator {

    public static void rotateObject(Point object, double angleDegrees) {
        // Convert the angle from degrees to radians
        double angleRadians = Math.toRadians(angleDegrees);

        // Perform the rotation using trigonometric functions
        int x = object.getX();
        int y = object.getY();
        object.setX((int) (x * Math.cos(angleRadians) - y * Math.sin(angleRadians)));
        object.setY((int) (x * Math.sin(angleRadians) + y * Math.cos(angleRadians)));
    }

    public static void main(String[] args) {
        // Example usage
        Point myObject = new Point(3, 4); // Create an object at coordinates (3, 4)
        System.out.println("Original coordinates: (" + myObject.getX() + ", " + myObject.getY() + ")");
        rotateObject(myObject, 90); // Rotate the object by 90 degrees
        System.out.println("Rotated coordinates: (" + myObject.getX() + ", " + myObject.getY() + ")");
    }
}

class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
