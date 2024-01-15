import javax.swing.*;
import java.awt.*;

public class DDALineExample extends JPanel {

    public void ddaLine(Graphics g, int x0, int y0, int x1, int y1) {
        int dx = x1 - x0;
        int dy = y1 - y0;
        int steps = Math.max(Math.abs(dx), Math.abs(dy));
        float xIncrement = (float) dx / steps;
        float yIncrement = (float) dy / steps;
        float x = x0;
        float y = y0;

        for (int i = 0; i <= steps; i++) {
            g.drawLine(Math.round(x), Math.round(y), Math.round(x), Math.round(y));
            x += xIncrement;
            y += yIncrement;
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        ddaLine(g, 50, 50, 200, 150); // Example: Draw a line from (50, 50) to (200, 150)
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("DDA Line Algorithm Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        DDALineExample panel = new DDALineExample();
        panel.setPreferredSize(new Dimension(400, 400));
        frame.setContentPane(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
