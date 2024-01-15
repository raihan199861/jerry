import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MidpointCircleExample extends JPanel {

    public void midCir(Graphics g, int x0, int y0, int xl, int yl) {
        int dx = xl - x0;
        int dy = yl - y0;
        int radius = (int) Math.sqrt(dx * dx + dy * dy);
        int x = 0;
        int y = radius;
        int d = 1 - radius;

        drawCircle(g, x0, y0, x, y);

        while (y > x) {
            if (d < 0) {
                d += 2 * x + 3;
            } else {
                d += 2 * (x - y) + 5;
                y--;
            }
            x++;
            drawCircle(g, x0, y0, x, y);
        }
    }

    private void drawCircle(Graphics g, int x0, int y0, int x, int y) {
        plot(g, x0 + x, y0 + y);
        plot(g, x0 - x, y0 + y);
        plot(g, x0 + x, y0 - y);
        plot(g, x0 - x, y0 - y);
        plot(g, x0 + y, y0 + x);
        plot(g, x0 - y, y0 + x);
        plot(g, x0 + y, y0 - x);
        plot(g, x0 - y, y0 - x);
    }

    private void plot(Graphics g, int x, int y) {
        g.drawLine(x, y, x, y);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        midCir(g, 100, 100, 200, 200); // Example: Draw a circle with midpoint at (100, 100) and a point on the circle at (200, 200)
        g.drawLine(100, 100, 200, 200); // Draw a line between the two specified endpoints
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Midpoint Circle Algorithm Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MidpointCircleExample panel = new MidpointCircleExample();
        panel.setPreferredSize(new Dimension(400, 400));
        frame.setContentPane(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
