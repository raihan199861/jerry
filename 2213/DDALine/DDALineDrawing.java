import java.awt.Graphics;

public class DDALineDrawing {
    public static void ddaAlg(Graphics g, int x0, int y0, int xl, int yl) {
        int dx = xl - x0;
        int dy = yl - y0;
        int steps = Math.max(Math.abs(dx), Math.abs(dy));

        float xIncrement = (float) dx / steps;
        float yIncrement = (float) dy / steps;

        float x = x0;
        float y = y0;

        g.drawLine(Math.round(x), Math.round(y), Math.round(xl), Math.round(yl));

        for (int k = 1; k < steps; k++) {
            x += xIncrement;
            y += yIncrement;
            g.drawLine(Math.round(x), Math.round(y), Math.round(x), Math.round(y));
        }
    }
}
