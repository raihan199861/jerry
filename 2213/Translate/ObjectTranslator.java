public class ObjectTranslator {

    public static void translateObject(Point object, int deltaX, int deltaY) {
        // Translate the object by adding deltaX to its x coordinate and deltaY to its y coordinate
        object.setX(object.getX() + deltaX);
        object.setY(object.getY() + deltaY);
    }

    public static void main(String[] args) {
        // Example usage
        Point myObject = new Point(3, 4); // Create an object at coordinates (3, 4)
        System.out.println("Original coordinates: (" + myObject.getX() + ", " + myObject.getY() + ")");
        translateObject(myObject, 2, 3); // Translate the object by (2, 3)
        System.out.println("Translated coordinates: (" + myObject.getX() + ", " + myObject.getY() + ")");
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
