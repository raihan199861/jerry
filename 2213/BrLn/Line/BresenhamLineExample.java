import javax.swing.*;
import java.awt.*;

public class BresenhamLineExample extends JPanel {

    public void BresenhamLine(Graphics g, int x0, int y0, int x1, int y1) {
        int dx = Math.abs(x1 - x0);
        int dy = Math.abs(y1 - y0);
        int sx = x0 < x1 ? 1 : -1;
        int sy = y0 < y1 ? 1 : -1;
        int err = dx - dy;

        while (x0 != x1 || y0 != y1) {
            g.drawLine(x0, y0, x0, y0);
            int e2 = 2 * err;
            if (e2 > -dy) {
                err -= dy;
                x0 += sx;
            }
            if (e2 < dx) {
                err += dx;
                y0 += sy;
            }
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        BresenhamLine(g, 50, 50, 200, 150); // Example: Draw a line from (50, 50) to (200, 150)
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Bresenham Line Algorithm Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        BresenhamLineExample panel = new BresenhamLineExample();
        panel.setPreferredSize(new Dimension(400, 400));
        frame.setContentPane(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
