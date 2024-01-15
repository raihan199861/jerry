import javax.swing.*;
import java.awt.*;

public class TriangleRotation extends JPanel {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Triangle Rotation");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new TriangleRotation());
        frame.setSize(400, 400);
        frame.setVisible(true);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Draw the initial triangle
        drawTriangle(g, 50, 50, 150, 50, 100, 150, Color.BLUE);

        // Rotate and draw the rotated triangle
        rotateTriangleDraw(g, 50, 50, 150, 50, 100, 150, Color.RED, Math.PI / 4);
    }

    private void drawTriangle(Graphics g, int x1, int y1, int x2, int y2, int x3, int y3, Color color) {
        int[] xPoints = {x1, x2, x3};
        int[] yPoints = {y1, y2, y3};
        int nPoints = 3;

        g.setColor(color);
        g.fillPolygon(xPoints, yPoints, nPoints);
    }

    private void rotateTriangleDraw(Graphics g, int x1, int y1, int x2, int y2, int x3, int y3, Color color, double angle) {
        // Create a new Graphics2D object
        Graphics2D g2d = (Graphics2D) g.create();

        // Set the rotation angle
        double centerX = (x1 + x2 + x3) / 3.0;
        double centerY = (y1 + y2 + y3) / 3.0;
        g2d.rotate(angle, centerX, centerY);

        // Draw the rotated triangle
        drawTriangle(g2d, x1, y1, x2, y2, x3, y3, color);

        // Dispose of the Graphics2D object
        g2d.dispose();
    }
}
