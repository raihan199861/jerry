import javax.swing.*;
import java.awt.*;

public class RectangleTranslator {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Rectangle Translator");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 400);
            frame.add(new JPanel() {
                @Override
                protected void paintComponent(Graphics g) {
                    super.paintComponent(g);
                    Graphics2D g2d = (Graphics2D) g;

                    // Draw the original rectangle
                    int originalX = 50;
                    int originalY = 50;
                    int originalWidth = 100;
                    int originalHeight = 50;
                    Rectangle originalRect = new Rectangle(originalX, originalY, originalWidth, originalHeight);
                    g2d.setColor(Color.BLUE);
                    g2d.draw(originalRect);

                    // Translate the rectangle and draw the translated rectangle
                    int dx = 100; // Translation along x-axis
                    int dy = 50;  // Translation along y-axis
                    Rectangle translatedRect = new Rectangle(originalX + dx, originalY + dy, originalWidth, originalHeight);
                    g2d.setColor(Color.RED);
                    g2d.draw(translatedRect);
                }

                @Override
                public Dimension getPreferredSize() {
                    return new Dimension(400, 400);
                }
            });
            frame.pack();
            frame.setVisible(true);
        });
    }
}
