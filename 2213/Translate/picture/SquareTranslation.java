import javax.swing.*;
import java.awt.*;

public class SquareTranslation extends JPanel {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Square Translation");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new SquareTranslation());
        frame.setSize(400, 400);
        frame.setVisible(true);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Draw the initial square
        drawSquare(g, 50, 50, 100, Color.BLUE);

        // Translate the square and draw the translated square
        squareTranslate(g, 50, 50, 100, Color.RED, 50, 50);
    }

    private void drawSquare(Graphics g, int x, int y, int size, Color color) {
        g.setColor(color);
        g.fillRect(x, y, size, size);
    }

    private void squareTranslate(Graphics g, int x, int y, int size, Color color, int dx, int dy) {
        // Translate the square by adding dx and dy to its coordinates
        int translatedX = x + dx;
        int translatedY = y + dy;

        // Draw the translated square
        drawSquare(g, translatedX, translatedY, size, color);
    }
}
