import javax.swing.*;
import java.awt.*;
import java.awt.geom.AffineTransform;

public class LineRotation extends JPanel {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Line Rotation");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new LineRotation());
        frame.setSize(400, 400);
        frame.setVisible(true);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Draw the initial line
        drawLine(g, 50, 50, 150, 100, Color.BLUE);

        // Rotate and draw the rotated line
        rotateLineDraw(g, 50, 50, 150, 100, Color.RED, Math.PI / 4);
    }

    private void drawLine(Graphics g, int x1, int y1, int x2, int y2, Color color) {
        g.setColor(color);
        g.drawLine(x1, y1, x2, y2);
    }

    private void rotateLineDraw(Graphics g, int x1, int y1, int x2, int y2, Color color, double angle) {
        // Create a new Graphics2D object
        Graphics2D g2d = (Graphics2D) g.create();

        // Set the rotation angle
        double centerX = (x1 + x2) / 2.0;
        double centerY = (y1 + y2) / 2.0;
        g2d.rotate(angle, centerX, centerY);

        // Draw the rotated line
        g2d.setColor(color);
        g2d.drawLine(x1, y1, x2, y2);

        // Dispose of the Graphics2D object
        g2d.dispose();
    }
}
