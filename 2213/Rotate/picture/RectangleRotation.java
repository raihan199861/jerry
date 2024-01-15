import javax.swing.*;
import java.awt.*;

public class RectangleRotation extends JPanel {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Rectangle Rotation");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new RectangleRotation());
        frame.setSize(400, 400);
        frame.setVisible(true);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Draw the initial rectangle
        drawRectangle(g, 50, 50, 100, 50, Color.BLUE);

        // Rotate and draw the rotated rectangle
        rotateRectangleDraw(g, 50, 50, 100, 50, Color.RED, Math.PI / 4);
    }

    private void drawRectangle(Graphics g, int x, int y, int width, int height, Color color) {
        g.setColor(color);
        g.fillRect(x, y, width, height);
    }

    private void rotateRectangleDraw(Graphics g, int x, int y, int width, int height, Color color, double angle) {
        // Create a new Graphics2D object
        Graphics2D g2d = (Graphics2D) g.create();

        // Set the rotation angle
        double centerX = x + width / 2.0;
        double centerY = y + height / 2.0;
        g2d.rotate(angle, centerX, centerY);

        // Draw the rotated rectangle
        g2d.setColor(color);
        g2d.fillRect(x, y, width, height);

        // Dispose of the Graphics2D object
        g2d.dispose();
    }
}
