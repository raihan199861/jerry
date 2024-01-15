import javax.swing.*;
import java.awt.*;
import java.awt.geom.AffineTransform;

public class SquareRotation extends JPanel {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Square Rotation");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new SquareRotation());
        frame.setSize(400, 400);
        frame.setVisible(true);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Draw the initial square
        drawSquare(g, 50, 50, 100, Color.BLUE);

        // Rotate and draw the rotated square
        rotateScaleDraw(g, 50, 50, 100, Color.RED, Math.PI / 4, 1.0);
    }

    private void drawSquare(Graphics g, int x, int y, int size, Color color) {
        g.setColor(color);
        g.fillRect(x, y, size, size);
    }

    private void rotateScaleDraw(Graphics g, int x, int y, int size, Color color, double angle, double scale) {
        // Create a new Graphics2D object
        Graphics2D g2d = (Graphics2D) g.create();

        // Translate to the center of the square
        g2d.translate(x + size / 2, y + size / 2);

        // Rotate the square
        g2d.rotate(angle);

        // Scale the square
        g2d.scale(scale, scale);

        // Draw the rotated and scaled square
        g2d.setColor(color);
        g2d.fillRect(-size / 2, -size / 2, size, size);

        // Dispose of the Graphics2D object
        g2d.dispose();
    }
}
