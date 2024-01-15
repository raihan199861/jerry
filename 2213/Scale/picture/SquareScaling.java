import javax.swing.*;
import java.awt.*;

public class SquareScaling extends JPanel {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Square Scaling");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new SquareScaling());
        frame.setSize(400, 400);
        frame.setVisible(true);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Draw the initial square
        drawSquare(g, 50, 50, 100, Color.BLUE);

        // Scale and draw the scaled square
        squareScaleDraw(g, 50, 50, 100, Color.RED, 1.5);
    }

    private void drawSquare(Graphics g, int x, int y, int size, Color color) {
        g.setColor(color);
        g.fillRect(x, y, size, size);
    }

    private void squareScaleDraw(Graphics g, int x, int y, int size, Color color, double scale) {
        // Scale the square by multiplying its size with the scale factor
        int scaledSize = (int) (size * scale);

        // Draw the scaled square
        drawSquare(g, x, y, scaledSize, color);
    }
}
