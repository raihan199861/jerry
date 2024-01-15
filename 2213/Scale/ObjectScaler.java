public class ObjectScaler {

    public static void scaleObject(Point object, double scaleFactor) {
        // Scale the object by multiplying its coordinates by the scaleFactor
        object.setX((int) (object.getX() * scaleFactor));
        object.setY((int) (object.getY() * scaleFactor));
    }

    public static void main(String[] args) {
        // Example usage
        Point myObject = new Point(3, 4); // Create an object at coordinates (3, 4)
        System.out.println("Original coordinates: (" + myObject.getX() + ", " + myObject.getY() + ")");
        scaleObject(myObject, 2.5); // Scale the object by a factor of 2.5
        System.out.println("Scaled coordinates: (" + myObject.getX() + ", " + myObject.getY() + ")");
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
