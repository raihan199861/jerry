import java.awt.Graphics;

public class BresenhamsCircle {
    public static void bresenhamsCir(Graphics g, int x0, int y0, int xl, int yl) {
        int radius = (int) Math.sqrt(Math.pow(xl - x0, 2) + Math.pow(yl - y0, 2));
        int x = radius;
        int y = 0;
        int decision = 1 - x;

        while (y <= x) {
            plotCirclePoints(g, x0, y0, x, y);
            y++;
            if (decision <= 0) {
                decision += 2 * y + 1;
            } else {
                x--;
                decision += 2 * (y - x) + 1;
            }
            plotCirclePoints(g, x0, y0, x, y);
        }
    }

    private static void plotCirclePoints(Graphics g, int x0, int y0, int x, int y) {
        plot8Points(g, x0, y0, x, y);
        plot8Points(g, x0, y0, y, x);
    }

    private static void plot8Points(Graphics g, int x0, int y0, int x, int y) {
        g.drawLine(x0 + x, y0 + y, x0 + x, y0 + y);
        g.drawLine(x0 - x, y0 + y, x0 - x, y0 + y);
        g.drawLine(x0 + x, y0 - y, x0 + x, y0 - y);
        g.drawLine(x0 - x, y0 - y, x0 - x, y0 - y);
        g.drawLine(x0 + y, y0 + x, x0 + y, y0 + x);
        g.drawLine(x0 - y, y0 + x, x0 - y, y0 + x);
        g.drawLine(x0 + y, y0 - x, x0 + y, y0 - x);
        g.drawLine(x0 - y, y0 - x, x0 - y, y0 - x);
    }
}
