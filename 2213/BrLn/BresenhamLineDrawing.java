import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

public class BresenhamLineDrawing {
    public static List<Point> drawLine(int x1, int y1, int x2, int y2) {
        List<Point> points = new ArrayList<>();
        
        int dx = Math.abs(x2 - x1);
        int dy = Math.abs(y2 - y1);
        int sx = (x1 < x2) ? 1 : -1;
        int sy = (y1 < y2) ? 1 : -1;
        int err = dx - dy;
        int e2;
        
        while (true) {
            points.add(new Point(x1, y1));
            
            if (points.size() >= 10) {
                break;
            }
            
            if (x1 == x2 && y1 == y2) {
                break;
            }
            
            e2 = 2 * err;
            if (e2 > -dy) {
                err -= dy;
                x1 += sx;
            }
            if (e2 < dx) {
                err += dx;
                y1 += sy;
            }
        }
        
        return points;
    }
    
    public static void main(String[] args) {
        int x1 = 1, y1 = 1, x2 = 10, y2 = 20;
        List<Point> points = drawLine(x1, y1, x2, y2);
        for (Point point : points) {
            System.out.println("(" + point.x + ", " + point.y + ")");
        }
    }
}